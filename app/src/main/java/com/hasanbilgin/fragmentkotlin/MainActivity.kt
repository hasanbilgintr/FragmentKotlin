package com.hasanbilgin.fragmentkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.replace
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun fragment2OnClick(view: View) {
        supportFragmentManager.beginTransaction().replace(R.id.frameLayout, BlankFragment2()).setReorderingAllowed(true).commit()
    }

    fun fragment1OnClick(view: View) {

        supportFragmentManager.beginTransaction().replace(R.id.frameLayout, BlankFragment()).setReorderingAllowed(true).commit()

    } 
}