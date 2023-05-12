package com.example.wordbook.test.testdate

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.wordbook.database.getDatabase
import com.example.wordbook.repository.WordRepository
import com.example.wordbook.test.TestViewModel
import kotlinx.coroutines.launch

class TestDateViewModel(application: Application) : ViewModel() { //AndroidViewModel(application)


    private val repository = WordRepository(getDatabase(application))

    private val _mTestUnit = MutableLiveData<TestViewModel.TestUnit>()
    val mTestUnit: LiveData<TestViewModel.TestUnit>
        get() = _mTestUnit

    private val _mResultState = MutableLiveData(TestViewModel.ResultState.NONE)
    val mResultState: LiveData<TestViewModel.ResultState>
        get() = _mResultState

    var numOfWords = 30

    fun onClickDay(day: Int){
        viewModelScope.launch {
            //day 버튼을 클릭하면 해당 day의 단어들 중에서 numOfWords 만큼의 단어를 가져와 테스트 하도록 함
            val shuffledList = repository.getWordsOfDay(day).shuffled().take(numOfWords)
            _mTestUnit.value =
                TestViewModel.TestUnit(day, shuffledList[0], shuffledList.subList(0, 4).shuffled())
            _mResultState.value = TestViewModel.ResultState.NONE
        }
    }

}