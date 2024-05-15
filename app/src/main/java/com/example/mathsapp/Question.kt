package com.example.mathsapp

// Data class representing a single question
data class Question(
    val question: String,       // The text of the question
    val options: List<String>,  // List of options for the question
    val correctOption: Int      // Index of the correct option in the options list
)
