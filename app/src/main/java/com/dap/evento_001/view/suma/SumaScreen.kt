package com.dap.evento_001.view.suma

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import com.dap.evento_001.R
import com.dap.evento_001.view.Espacio
import com.dap.evento_001.view.Titulo

@Preview
@Composable
fun SumaScreen(){
    var num1 by remember { mutableStateOf("") }
    var num2 by remember { mutableStateOf("") }
    var result by remember { mutableStateOf(0) }
    val suma = SumaViewModel()
    Scaffold() {myPadding->
        Column(
            Modifier
                .fillMaxSize()
                .padding(myPadding)
        ) {
            Titulo(stringResource(R.string.tituloSuma))
            Espacio(10)
            TextField(
                value = num1,
                onValueChange = {num1 = it},
                Modifier.fillMaxWidth(),
                placeholder = {Text(stringResource(R.string.num1))},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
            )
            Espacio(10)
            TextField(
                value = num2,
                onValueChange = {num2 = it},
                Modifier.fillMaxWidth(),
                placeholder = {Text(stringResource(R.string.num2))},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
            )
            Espacio(10)
            Button(
                onClick = {
                    result = suma.suma(num1.toInt(), num2.toInt() )
                },
                Modifier.fillMaxWidth()
            ) {
                Text(stringResource(R.string.botonSumar))
            }
            Espacio(10)
            Text("${stringResource(R.string.resultado)} $result")
        }
    }
}

