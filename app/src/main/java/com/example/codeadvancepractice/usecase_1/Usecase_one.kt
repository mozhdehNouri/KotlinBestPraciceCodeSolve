package com.example.codeadvancepractice.usecase_1

/*
problem: The sum of the numbers being 12
 */

fun main() {
    val password = "dfdfd"
    val range = 1..3
    val letter = 'f'

    println(password.validatePartOne(letter, range))

}

fun String.validatePartOne(letter:Char,range: IntRange) = count { it == letter } in range
