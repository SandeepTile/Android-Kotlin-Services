package com.example.sandy.service_test

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener({

            var i=Intent(this,MyService::class.java)
            startService(i)

        })

        button2.setOnClickListener({

            var i=Intent(this,MyService::class.java)
            stopService(i)

        })

    }
}
