package com.example.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast

class QuizActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        val correctToast = Toast.makeText(this, R.string.correct_toast, Toast.LENGTH_SHORT)
        val wrongToast = Toast.makeText(this, R.string.incorrect_toast, Toast.LENGTH_SHORT)
        correctToast.setGravity(Gravity.TOP, 0, 0)
        wrongToast.setGravity(Gravity.TOP, 0, 0)

        val mTrueButton = findViewById<Button>(R.id.true_button)
        mTrueButton.setOnClickListener { correctToast.show() }

        val mFalseButton = findViewById<Button>(R.id.false_button)
        mFalseButton.setOnClickListener { wrongToast.show() }
    }
}