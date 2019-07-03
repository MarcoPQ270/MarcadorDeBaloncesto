package com.example.marco.app2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
     var marcadora: Int=0
     var marcadorb: Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun reset(v:View){
        edt1.setText("0")
        edt2.setText("0")
        marcadora=0
        marcadorb=0
    }
    fun mas1 (v:View){
        marcadora++
        edt1.setText("$marcadora")
    }
    fun mas2(v:View){
        marcadora+=2
        edt1.setText("$marcadora")
    }
    fun mas3(v:View){
        marcadora+=3
        edt1.setText("$marcadora")
    }
    fun mas1b(v:View){
        marcadorb++
        edt2.setText("$marcadorb")
    }
    fun mas2b(v:View){
        marcadorb+=2
        edt2.setText("$marcadorb")
    }
    fun mas3b(v:View){
        marcadorb+=3
        edt2.setText("$marcadorb")
    }
}
