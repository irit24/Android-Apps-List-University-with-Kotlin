package com.ilyasa.university

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ilyasa.university.adapter.UniversityAdapter
import com.ilyasa.university.data.UniversityData

class MainActivity : AppCompatActivity() {

    private lateinit var rvUniversity: RecyclerView
    private var list: ArrayList<University> = arrayListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvUniversity = findViewById(R.id.rv_university)
        rvUniversity.setHasFixedSize(true)
        list.addAll(UniversityData.listData)
        showUniversity()

    }

    private fun showUniversity() {
        rvUniversity.layoutManager = LinearLayoutManager(this)
        val universityAdapter = UniversityAdapter(list)
        rvUniversity.adapter = universityAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(itemId: Int) {
        when (itemId) {
            R.id.action_about -> {

                val moveIntent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(moveIntent)
            }

        }
    }
}