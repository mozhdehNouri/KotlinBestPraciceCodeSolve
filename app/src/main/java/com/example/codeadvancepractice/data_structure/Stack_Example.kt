package com.example.codeadvancepractice.data_structure

import android.util.Patterns
import java.util.Stack
import java.util.regex.Pattern


// given a string containing just the characters '(' , ')','{','}','[',']'
// input is valid if 1-open brackets must be closed by the same type of brackets. 2. open brackets must be closed in the correct order.
// "()" true - "{}()" true - "(]" false

fun main() {
    val result = stackExample("{}(){")
    println(result)

}

fun stackExample(s: String): Boolean {

    val a1 = '['
    val a2 = ']'
    val b1 = '{'
    val b2 = '}'
    val c1 = '('
    val c2 = ')'
    val stack = Stack<Char>()

    s.forEach { char ->
        when (char) {
            a1, b1, c1 -> {
                stack.push(char)
            }

            a2, b2, c2 -> {
                if (stack.isEmpty()) return false
                val top = stack.pop()
                if ((top != a1) && (char == a2) || (top != b1) && (char == b2) || (top != c1) && (char == c2)) return false

            }
        }
    }
    return stack.isEmpty()
}