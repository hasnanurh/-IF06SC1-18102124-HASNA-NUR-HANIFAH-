package com.hasnanurhanifah_18102124.kotlinfundamental

fun main() {
    val text: String? = null
    val textLength = text?.length ?: 7
    val score:Int? = null

    println(textLength)
    print(score ?: 89)
}