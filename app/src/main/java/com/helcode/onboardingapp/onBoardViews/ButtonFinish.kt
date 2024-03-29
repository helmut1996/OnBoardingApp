package com.helcode.onboardingapp.onBoardViews

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ButtonFinish(CurrenPage:Int){
    Row(
        modifier = Modifier
            .padding(bottom = 20.dp)
            .fillMaxWidth(),
        horizontalArrangement =
        if (CurrenPage !=3) Arrangement.SpaceBetween
        else Arrangement.Center
    ) {

        if (CurrenPage == 3 ){
            OutlinedButton(onClick = { /*TODO*/ }) {
                Text(text = "Entrar", modifier = Modifier
                    .padding(vertical = 8.dp, horizontal = 40.dp),
                    color = Color.Gray
                )
            }
        }

    }
}