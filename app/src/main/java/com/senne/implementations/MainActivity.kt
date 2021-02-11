package com.senne.implementations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val checkBox : CheckBox = findViewById(R.id.checkBox)
        val scissor : ImageView = findViewById(R.id.scissor)
        checkBox.setOnClickListener{
            if(checkBox.isChecked) scissor.setColorFilter(resources.getColor( R.color.red))
            if(!checkBox.isChecked) scissor.setColorFilter(resources.getColor( R.color.black))
        }


    }


}