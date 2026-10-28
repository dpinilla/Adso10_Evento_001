package com.dap.evento_001.view

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dap.evento_001.ui.theme.Azul

@Composable
fun Titulo(titulo: String){
    Text(
        titulo,
        Modifier
            .fillMaxWidth(),
        fontSize = 18.sp,
        textAlign = TextAlign.Center,
        color = Azul
    )
}

@Composable
fun Espacio(valor: Int){
    Spacer(
        Modifier.height(valor.dp)
    )
}