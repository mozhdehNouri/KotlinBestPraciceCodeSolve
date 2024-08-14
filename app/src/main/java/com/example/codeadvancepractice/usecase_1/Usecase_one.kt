package com.example.codeadvancepractice.usecase_1

/*
problem: The sum of the numbers being 12
 */

fun main() {
    val numberList = listOf(3, 5, 9, 8, 7, 9, 1, 2)
    val value = numberList.withTwoNumbers(12)


    // Map: x->(y,z) where y+z =2020
//    val complementPairs: Map<Int, Pair<Int, Int>?> =
//        numberList.associateWith {
//            numberList.withThreeNumbers(12 - it)
//        }

//    numberList.firstNotNullOfOrNull {
//        val pair = numberList.withThreeNumbers(12 - it)
//        if (pair != null) Triple(it, pair.first, pair.second) else null
//    }

}


fun List<Int>.withTwoNumbers(sum: Int) {

    // [3, 5, 9, 8, 7, 9, 1, 2]
    //{9=3, 7=5, 3=9, 4=8, 5=7, 11=1, 10=2}
    // if we print both of them the output is like above
    // now we must check if both number exist in list its mean we found the number like 7=5
    // we have 7 and 5 and sum is 12
    val complements = associateBy { sum - it }

    val value = map { number ->
        val complement = complements[number]
        if (complement != null) {
            Pair(number, complement)
        } else null
    }
}

fun List<Int>.withThreeNumbers(sum: Int): Pair<Int, Int>? {
    val complements = associateBy { sum - it }
    return firstNotNullOfOrNull { number ->
        val complement = complements[number]
        if (complement != null) {
            Pair(number, complement)
        } else null
    }
}