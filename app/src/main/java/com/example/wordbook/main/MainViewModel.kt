package com.example.wordbook.main

import android.app.Application
import androidx.lifecycle.*
import com.example.wordbook.database.getDatabase
import com.example.wordbook.repository.WordRepository
import kotlinx.coroutines.async
import kotlinx.coroutines.launch


enum class MovingState {
    IDLE, MOVE, FAIL
}

class MainViewModel(application: Application): AndroidViewModel(application) {
    companion object {
        const val LIMIT_TO_MOVE_STUDY = 1
        const val LIMIT_TO_MOVE_TEST = 4
    }
    private val repository = WordRepository(getDatabase(application))

    private val _mStudyMovingState = MutableLiveData<MovingState>(MovingState.IDLE)
    val mStudyMovingState: LiveData<MovingState>
        get() = _mStudyMovingState

    //추가한 부분
    private val _mTestMovingState = MutableLiveData<MovingState>(MovingState.IDLE)
    val mTestMovingState: LiveData<MovingState>
        get() = _mTestMovingState

    private val _mTestWordGoalMovingState = MutableLiveData<MovingState>(MovingState.IDLE)
    val mTestWordGoalState: LiveData<MovingState>
        get() = _mTestWordGoalMovingState

    private val _mTestDateMovingState = MutableLiveData<MovingState>(MovingState.IDLE)
    val mTestDateMovingState: LiveData<MovingState>
        get() = _mTestDateMovingState

    fun moveToStudy() {
        viewModelScope.launch {
            if (moveToStudyEnabled()) {
                _mStudyMovingState.value = MovingState.MOVE
            } else {
                _mStudyMovingState.value = MovingState.FAIL
            }
        }
    }

    fun setStudyMovingStateIdle() {
        _mStudyMovingState.value = MovingState.IDLE
    }

    fun moveToTest() {
        viewModelScope.launch {
            if (moveToTestEnabled()) {
                _mTestMovingState.value = MovingState.MOVE
            } else {
                _mTestMovingState.value = MovingState.FAIL
            }
        }
    }

    fun setTestMovingStateIdle() {
        _mTestMovingState.value = MovingState.IDLE
    }

    private suspend fun moveToStudyEnabled(): Boolean {
        return viewModelScope.async {
            repository.getCounts() >= LIMIT_TO_MOVE_STUDY
        }.await()
    }

    private suspend fun moveToTestEnabled(): Boolean {
        return viewModelScope.async {
            repository.getCounts() >= LIMIT_TO_MOVE_TEST
        }.await()
    }

    /*fun moveToTestWordGoal(){
        viewModelScope.launch {
            _mTestWordGoalMovingState.value = MovingState.MOVE
        }
    }

    fun moveToTestDate(){
        _mTestDateMovingState.value = MovingState.MOVE

        /*val fragmentManager = (getApplication() as AppCompatActivity).supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container, TestDateFragment())
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()*/
    }*/


}