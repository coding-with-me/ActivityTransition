package com.codingwithme.activitytransition

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_one.*

class ActivityOne : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)

        btnOpenActivity.setOnClickListener{
            //open second activity
            openActivity()
        }
    }

    private fun openActivity(){
        val intent = Intent(this@ActivityOne,ActivityTwo::class.java)
        startActivity(intent)
    }
}
