package xyz.savvamirzoyan.wordremember.view.activity

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.google.android.material.navigation.NavigationView
//import com.opencsv.CSVReader
import xyz.savvamirzoyan.wordremember.R
import java.io.FileReader

//CSV
//fun readCSV(filePath: String): List<Array<String>> {
    //val csvReader = CSVReader(FileReader(filePath))
    //val list = csvReader.readAll()
    //csvReader.close()
    //return list
//}

fun Activity.hideKeyboard() {
    hideKeyboard(currentFocus ?: View(this))
}


fun Context.hideKeyboard(view: View) {
    val inputMethodManager = getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
    inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
}

class MainActivity : AppCompatActivity() {

    private val navigationController by lazy {
        findNavController(R.id.main_navigation_host_fragment)
    }
    private val appBarConfig by lazy {
        AppBarConfiguration(
            navigationController.graph
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        NavigationUI.setupActionBarWithNavController(this, navigationController)
        NavigationUI.setupWithNavController(
            findViewById<NavigationView>(R.id.navigation_view),
            navigationController
        )



    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navigationController, appBarConfig)
    }
}