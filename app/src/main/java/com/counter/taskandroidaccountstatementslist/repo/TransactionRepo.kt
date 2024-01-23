package com.counter.taskandroidaccountstatementslist.repo

import com.counter.taskandroidaccountstatementslist.model.Transaction

class TransactionRepo {
    companion object{
     val transactionList = listOf(
        Transaction("Saving", 245.23, 4354.8, "KWD", "Withdrawal"),
        Transaction("Salary", 575.23, 3465.4, "KWD", "Deposit"),
        Transaction("Invest", 3566.23, 554354.8, "KWD", "Deposit"),
         Transaction("Salary", 366.23, 74354.8, "KWD", "Withdrawal"),
         Transaction("Saving", 3916.23, 44354.8, "KWD", "Deposit"),
    )
   }
}