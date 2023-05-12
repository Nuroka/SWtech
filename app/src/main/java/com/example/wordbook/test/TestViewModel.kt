package com.example.wordbook.test

import android.app.Application
import androidx.lifecycle.*
import com.example.wordbook.R
import com.example.wordbook.database.Word
import com.example.wordbook.database.getDatabase
import com.example.wordbook.repository.WordRepository
import com.example.wordbook.vocalist.VocaListFragment
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class TestViewModel(application: Application): AndroidViewModel(application) {
    data class TestUnit(val day: Int, val question: Word, val candidates: List<Word>) //day 추가

    enum class ResultState {
        NONE,
        CORRECT,
        WRONG
    }

    companion object {
        private val DELAY_TIME_SHOWING_NEXT_TEST = 800L
    }
    private val repository = WordRepository(getDatabase(application))

    private val _mTestUnit = MutableLiveData<TestUnit>()
    val mTestUnit: LiveData<TestUnit>
        get() = _mTestUnit

    private val _mResultState = MutableLiveData(ResultState.NONE)
    val mResultState: LiveData<ResultState>
        get() = _mResultState

    /*init {
        loadNextTestUnit()
    }*/

    /*private fun loadNextTestUnit() {
        viewModelScope.launch {
            val shuffledList = repository.getWordList().shuffled()
            _mTestUnit.value = TestUnit(day=0, shuffledList[0], shuffledList.subList(0, 4).shuffled())
            _mResultState.value = ResultState.NONE
        }
    }*/

    var numOfWords = 30 // 단어목표설정에서 선택한 단어 수를 저장하 ㄹ변수. 기본값은 30으로 설정

    private var correctCount = 0 // 정답 개수를 저장할 변수 추가

    fun onClickCandidate(candidateIdx: Int) {
        //수정한 부분
        //만약에 candidateIdx가 4인 경우(모르겠음을 선택한 경우), None으로 리턴.
        if (candidateIdx == 4){
            _mResultState.value = ResultState.NONE
            viewModelScope.launch {
                delay(DELAY_TIME_SHOWING_NEXT_TEST)
                onClickDay(_mTestUnit.value?.day ?: 1) // _mTestUnit이 null인 경우 1로 설정
            }
        } else{ //아니면 정답 확인
            when (isCorrect(candidateIdx)) {
                true -> {
                    _mResultState.value = ResultState.CORRECT
                    correctCount++ // 정답 개수 증가
                    viewModelScope.launch {
                        delay(DELAY_TIME_SHOWING_NEXT_TEST)
                        onClickDay(_mTestUnit.value?.day ?: 1)
                    }
                }
                false -> {
                    _mResultState.value = ResultState.WRONG
                    viewModelScope.launch {
                        delay(DELAY_TIME_SHOWING_NEXT_TEST)
                        onClickDay(_mTestUnit.value?.day ?: 1)
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

    //추가한 부분
    fun onClickDay(day: Int){
        viewModelScope.launch {
            //day 버튼을 클릭하면 해당 day의 단어들 중에서 numOfWords 만큼의 단어를 가져와 테스트 하도록 함
            val shuffledList = repository.getWordsOfDay(day).shuffled().take(numOfWords)
            _mTestUnit.value = TestUnit(day, shuffledList[0], shuffledList.subList(0, 4).shuffled())
            _mResultState.value = ResultState.NONE
        }
    }

    //추가한 부분
    fun getCorrectCount(): Int {
        return correctCount
    }
}