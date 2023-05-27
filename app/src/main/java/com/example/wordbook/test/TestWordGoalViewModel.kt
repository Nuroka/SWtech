package com.example.wordbook.test

import android.app.Application
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.fragment.app.Fragment
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.wordbook.BaseActivity
import com.example.wordbook.R
import com.example.wordbook.database.Word
import com.example.wordbook.database.WordDatabase
import com.example.wordbook.database.fillInDbFromCsv
import com.example.wordbook.main.MainFragment
import com.opencsv.CSVReaderBuilder
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.io.BufferedReader
import java.io.FileReader
import java.io.InputStreamReader
import java.nio.charset.Charset
import java.nio.charset.StandardCharsets


class TestWordGoalViewModel(application: Application): AndroidViewModel(application) {

    //현재 단어 목표 개수
    private val _mTestWordGoal = MutableLiveData<Int>()
    val mTestWordGoal: LiveData<Int>
        get() = _mTestWordGoal

    fun wordGoalDb(selectedRange: Int) {
        _mTestWordGoal.value = selectedRange
    }

}

















