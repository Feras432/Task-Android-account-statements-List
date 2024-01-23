package com.counter.taskandroidaccountstatementslist.model

data class Transaction(
    val name: String,
    var amount: Double,
    var balance: Double,
    val currency: String,
    var type: String
)
