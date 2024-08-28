package com.example.codeadvancepractice.data_structure

import android.util.Patterns
import java.util.Stack
import java.util.regex.Pattern


// given a string containing just the characters '(' , ')','{','}','[',']'
// input is valid if 1-open brackets must be closed by the same type of brackets. 2. open brackets must be closed in the correct order.
// "()" true - "{}()" true - "(]" false

fun main() {
    stackExample("{}(5u}]")

}

fun stackExample(s: String): Boolean {

    val validString = "[](){}"
    val a1 = '['
    val a2 = ']'
    val b1 = '{'
    val b2 = '}'
    val c1 = '('
    val c2 = ')'
    val stack = Stack<Char>()
    if (s.all { validString.contains(it) }) {
        s.forEach(stack::push)
    }
    when(stack.peek()){
        a2 , b2 , c2 ->{


        }


    }



    return false
}