package com.example.codeadvancepractice.data_structure

import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

fun bar(s: String?) {
    if (!s.isNullOrEmpty()) s.length
}

@OptIn(ExperimentalContracts::class)
fun CharSequence?.isNullOrEmpty(): Boolean {
    contract {
        returns(false) implies (this@isNullOrEmpty != null)
    }

    return this == null || this.length == 0
}