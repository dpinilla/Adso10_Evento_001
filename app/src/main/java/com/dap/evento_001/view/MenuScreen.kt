package com.dap.evento_001.view

import android.widget.Button
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dap.evento_001.R


@Composable
fun MenuScreen(
    onGoSuma: () -> Unit
){

    Scaffold() {MyPadding->

        Column(
            Modifier
                .fillMaxSize()
                .padding(MyPadding),
            Arrangement.Center
        ) {
            Button(
                onClick = {
                    onGoSuma()
                },
                Modifier
                    .fillMaxWidth()
            )
            {
                Text(stringResource(R.string.suma))
            }
            Spacer(Modifier.height(25.dp))
            Button(
                onClick = {},
                Modifier
                    .fillMaxWidth()
            )
            {
                Text(stringResource(R.string.suma))
            }
            Spacer(Modifier.height(25.dp))
            Button(
                onClick = {},
                Modifier
                    .fillMaxWidth()
            )
            {
                Text(stringResource(R.string.suma))
            }
            Spacer(Modifier.height(25.dp))
            Button(
                onClick = {},
                Modifier
                    .fillMaxWidth()
            )
            {
                Text(stringResource(R.string.suma))
            }
        }
    }
}