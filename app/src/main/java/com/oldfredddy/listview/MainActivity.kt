package com.oldfredddy.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameList = ArrayList<String>()
        nameList.add("Серега")
        nameList.add("Леха")
        nameList.add("Степан")
        nameList.add("Саша")
        nameList.add("Кваша")

        listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, nameList)
        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Pressed item position : ${nameList.get(position)}", Toast.LENGTH_LONG).show()
        }
    }
}