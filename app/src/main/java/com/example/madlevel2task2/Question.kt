package com.example.madlevel2task2

data class Question (
    var question: String,
    var truth: Boolean
) {
    companion object {
        var QUESTIONS = arrayOf(
            "this is true",
            "this is false"
        )

        var TRUTHS = arrayOf(
            true,
            false
        )
    }
}