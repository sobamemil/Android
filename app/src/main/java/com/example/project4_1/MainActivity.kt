package com.example.project4_1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var editText1: EditText
    lateinit var editText2: EditText
    lateinit var buttonAdd: Button
    lateinit var buttonSub: Button
    lateinit var buttonMul: Button
    lateinit var buttonDiv: Button
    lateinit var textResult: TextView
    lateinit var num1: String
    lateinit var num2: String
    private var result: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "초간단 계산기"

        editText1 = findViewById(R.id.Edit1)
        editText2 = findViewById(R.id.Edit2)
        buttonAdd = findViewById(R.id.BtnAdd)
        buttonSub = findViewById(R.id.BtnSub)
        buttonMul = findViewById(R.id.BtnMul)
        buttonDiv = findViewById(R.id.BtnDiv)
        textResult = findViewById(R.id.TextResult)


        buttonAdd.setOnTouchListener { view, motionEvent ->
            num1 = editText1.text.toString()
            num2 = editText2.text.toString()
            result = num1.toInt() + num2.toInt()
            textResult.text = "계산 결과 : " + result.toString()
            false
        }
    }
}