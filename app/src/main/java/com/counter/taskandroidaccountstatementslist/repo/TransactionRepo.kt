package com.counter.taskandroidaccountstatementslist.repo

import com.counter.taskandroidaccountstatementslist.model.Transaction

class TransactionRepo {
    companion object{
     val transactionList = listOf(
        Transaction("Saving", 245.23, 4354.8, "KWD", "Withdrawal"),
        Transaction("Salary", 575.23, 3465.4, "KWD", "Deposit"),
        Transaction("Investment", 3566.23, 554354.8, "KWD", "Deposit"),
    )
   }
}