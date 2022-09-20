package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class AnswerActivity : AppCompatActivity() {

    lateinit var  resultTextView : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer)


        resultTextView = findViewById(R.id.showResultView)

        val answer = intent.getBooleanExtra("answeredCorrect", false)
        var score = intent.getIntExtra("score",0)
        val button = findViewById<Button>(R.id.backButton)
        button.setOnClickListener{
            score++
            finish()
        }


          //  resultTextView.text = "Rätt svar $score"
      //  }else {
      //      resultTextView.text = "Fel svar"

       // }
        //


        resultTextView.text = if (answer){
            "Rätt svar poäng : $score"
        } else {
            "fel svar"
        }


    }
}
