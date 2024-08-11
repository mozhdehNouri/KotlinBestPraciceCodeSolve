package com.example.codeadvancepractice.usecase_1

/*
problem: The sum of the numbers is 12
 */


fun main() {
    val numberList = listOf(3, 5, 9, 8, 7, 9, 1, 2)
    val assoc = numberList.associateBy { value ->
        println(12 - value)
    }
    val a = numberList.firstNotNullOf {
        val b = assoc[it]
        if (b != null){
            Pair(it,b)
        }
        else null

    }

}
