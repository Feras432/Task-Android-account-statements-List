package com.counter.taskandroidaccountstatementslist

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.counter.taskandroidaccountstatementslist.model.Transaction


@Composable
fun AccountStatement(
    transaction: Transaction,
    modifier: Modifier = Modifier

) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .height(100.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(20.dp)
                .fillMaxSize()
        ) {
            Column {
                Text(text = "${transaction.name}")

            }
            Row {
                Text(text = "${transaction.balance}")
                Text(text = "${transaction.currency}")
            }
            Column {
                Text(text = "${transaction.type}")

                    Row{

                    Text(text = "${transaction.amount}")
                    Text(text = "${transaction.currency}")
                }

            }

        }
    }

}
