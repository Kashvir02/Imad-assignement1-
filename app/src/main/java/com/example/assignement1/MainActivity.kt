package com.example.assignement1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var etTimeOfDay: EditText
    private lateinit var btnRecommend: Button
    private lateinit var btnReset: Button
    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etTimeOfDay = findViewById(R.id.etTimeOfDay)
        btnRecommend = findViewById(R.id.btnRecommend)
        btnReset = findViewById(R.id.btnReset)
        tvResult = findViewById(R.id.tvResult)

        btnRecommend.setOnClickListener {
            getRecommendation()
        }

        btnReset.setOnClickListener {
            resetFields()
        }
    }

    private fun getRecommendation() {
        val userInput = etTimeOfDay.text.toString().trim().lowercase()
        var recommendation: String

        if (userInput.isEmpty()) {
            recommendation = "Please enter a time of day."
        } else if (userInput == "morning") {
            recommendation = "Start your day by sending a cheerful good morning message to a friend or family member."
        } else if (userInput == "mid-morning" || userInput == "mid morning") {
            recommendation = "Use your mid-morning break to check in with a classmate or colleague."
        } else if (userInput == "afternoon") {
            recommendation = "Share a funny meme or message with a friend during the afternoon."
        } else if (userInput == "afternoon snack time" || userInput == "snack time") {
            recommendation = "Take a quick break and send someone a kind message."
        } else if (userInput == "dinner") {
            recommendation = "Have a short conversation with your family during dinner time."
        } else if (userInput == "after dinner" || userInput == "night" || userInput == "evening") {
            recommendation = "End your day by calling or texting someone you care about."
        } else {
            recommendation = "Invalid input. Please enter Morning, Mid-Morning, Afternoon, Snack Time, Dinner, Evening, or Night."
        }

        tvResult.text = recommendation
    }

    private fun resetFields() {
        etTimeOfDay.text.clear()
        tvResult.text = "Your recommendation will appear here..."
        etTimeOfDay.requestFocus()
    }
}

/*

website:W3Schools
author: W3schools
date published: nodate
date last accessed:20 March 2025
url: https://www.w3schools.com/kotlin/kotlin_conditions.php
*/

/*
Website: Geeksforgeeks linear layout
author: GeeksforGeeks
date published: 24 february 2025
Date accessed: 23  March 2025
url: https://www.geeksforgeeks.org/kotlin/android-linearlayout-in-kotlin/
 */

/*
Website:Chatgpt
author: Chatgpt (Open Ai)
date published : November 30, 2022
Date accessed: 29 March 2025
url:https://chatgpt.com/
 */