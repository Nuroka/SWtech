package com.example.wordbook.test

import android.app.Application
import android.content.Context
import androidx.activity.OnBackPressedCallback
import androidx.lifecycle.*
import com.example.wordbook.BaseActivity
import com.example.wordbook.database.Word
import com.example.wordbook.database.fillInDbFromCsv
import com.example.wordbook.database.getDatabase
import com.example.wordbook.repository.WordRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class TestViewModel(application: Application): AndroidViewModel(application) {
    data class TestUnit(val question: Word, val candidates: List<Word>)

    enum class ResultState {
        NONE,
        CORRECT,
        WRONG
    }

    companion object {
        private val DELAY_TIME_SHOWING_NEXT_TEST = 800L
    }
    private val repository = WordRepository(getDatabase(application))

    //추가한 부분
    val viewModel = TestWordGoalViewModel(application)

    val view2Model = TestFragment()

    var correctCount = 0 // 정답 개수를 저장할 변수
    private var remainingTestCount = 0 // 남은 테스트 개수를 저장할 변수


    private val _mTestUnit = MutableLiveData<TestUnit>()
    val mTestUnit: LiveData<TestUnit>
        get() = _mTestUnit

    private val _mResultState = MutableLiveData(ResultState.NONE)
    val mResultState: LiveData<ResultState>
        get() = _mResultState


    init {
        //remainingTestCount = viewModel.selectedRange
        remainingTestCount = viewModel.selectedRange
        loadNextTestUnit()
    }




    //수정한 부분
    private fun loadNextTestUnit() {
        viewModelScope.launch {
            if (remainingTestCount <= 0){ // 남은 테스트가 없으면 종료
                view2Model.addTestResultFragment() // 테스트 결과 페이지로 이동 (실행시켜보니 이동안됨)
                //return@launch
            }

            val shuffledList = repository.getWordList().shuffled() //여기서 이제 TestWordGoalViewModel에서 그룹화한 words배열의 단어들을 가져와서 구현
            _mTestUnit.value = TestUnit(shuffledList[0], shuffledList.subList(0, 4).shuffled())
            _mResultState.value = ResultState.NONE
            remainingTestCount-- // 남은 테스트 개수 감소

        }
    }



    fun onClickCandidate(candidateIdx: Int) {

        //만약에 candidateIdx가 4인 경우(모르겠음을 선택한 경우), None으로 리턴.
        if (candidateIdx == 4){
            _mResultState.value = ResultState.NONE
            viewModelScope.launch {
                delay(DELAY_TIME_SHOWING_NEXT_TEST)
                loadNextTestUnit()
            }

        } else{ //아니면 정답 확인
            when (isCorrect(candidateIdx)) {
                true -> {
                    _mResultState.value = ResultState.CORRECT
                    correctCount++ // 정답 개수 증가
                    viewModelScope.launch {
                        delay(DELAY_TIME_SHOWING_NEXT_TEST)
                        loadNextTestUnit()
                    }
                }
                false -> {
                    _mResultState.value = ResultState.WRONG
                    viewModelScope.launch {
                        delay(DELAY_TIME_SHOWING_NEXT_TEST)
                        loadNextTestUnit()
                    }
                }
            }
        }

    }

    private fun isCorrect(candidateIdx: Int): Boolean {
        _mTestUnit.value?.let {
            return it.candidates[candidateIdx].id == it.question.id
        }

        return false
    }




}

