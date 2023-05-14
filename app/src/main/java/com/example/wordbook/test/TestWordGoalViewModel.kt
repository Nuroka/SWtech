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
import com.example.wordbook.BaseActivity
import com.example.wordbook.R
import com.example.wordbook.database.Word
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
    private val context = application.applicationContext
    var words = listOf<Word>()
    var selectedRange = 0

    /*//wordGoalDb에서 가져온 값을 LiveData로 사용해서.. 이 클래스 외부에서도 볼수있게 함
    private val _words = MutableLiveData<List<Word>>()
    var words: LiveData<List<Word>> = _words*/


    fun wordGoalDb(selectedRange: Int) {
        this.selectedRange = selectedRange
        CoroutineScope(Dispatchers.IO).launch {
            val reader = CSVReaderBuilder(
                InputStreamReader(context.assets.open("ToeicWords_deleteDay.csv"), Charset.forName("CP949"))
            ).withSkipLines(1).build()
            val words = ArrayList<Word>()
            var id = 1

            reader.use{ r ->
                var line = r.readNext()

                while (line != null) {
                    if (id <= selectedRange) { // 선택한 범위를 초과하면 반복 중단
                        val word = Word(
                            id = id,
                            english = line[1],
                            means = line[2],
                            timestamp = line[3]
                        )
                        words.add(word)
                    } else{
                        break
                    }
                    id++
                    line = r.readNext()
                }
            }
            /*//LiveData에 데이터를 업데이트
            _words.postValue(words)*/

            /*this.words = words
            return words*/
            this@TestWordGoalViewModel.words = words

        }


    }




}


/*class TestWordGoalViewModel(private val context: Context): Fragment() {

    /*override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_test_word_goal, container, false)
    }*/

    fun fillInDbFromCsv(selectedRange: Int) {
        CoroutineScope(Dispatchers.IO).launch {
            val reader = CSVReaderBuilder(
                InputStreamReader(context.assets.open("ToeicWords_deleteDay.csv"), Charset.forName("CP949"))
            ).withSkipLines(1).build()
            val words = ArrayList<Word>()
            var id = 1

            reader.use{ r ->
                var line = r.readNext()

                while (line != null) {
                    if (id <= selectedRange) { // 선택한 범위를 초과하면 반복 중단
                        val word = Word(
                            id = id,
                            english = line[1],
                            means = line[2],
                            timestamp = line[3]
                        )
                        words.add(word)
                    } else{
                        break
                    }
                    id++
                    line = r.readNext()
                }
            }
        }

    }

     /*val fileName = "src/main/assets/ToeicWords_deleteDay.csv"
    val inputStream = context.assets.open(fileName)
    val reader = BufferedReader(InputStreamReader(inputStream, "UTF-8"))*/
}*/










