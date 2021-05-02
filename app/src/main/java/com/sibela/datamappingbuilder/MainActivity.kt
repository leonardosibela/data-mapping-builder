package com.sibela.datamappingbuilder

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    val student = Student.Builder()
            .name("Alex")
            .standard(10)
            .rollNumber(720)
            .build()
}