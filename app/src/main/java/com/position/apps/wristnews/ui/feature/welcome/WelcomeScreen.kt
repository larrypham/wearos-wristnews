package com.position.apps.wristnews.ui.feature.welcome

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.wear.compose.material.Button
import androidx.wear.compose.material.ButtonDefaults
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.Scaffold
import androidx.wear.compose.material.Text
import com.position.apps.wristnews.R
import com.position.apps.wristnews.utils.VerticalSpacer

@Composable
fun WelcomeScreen(onGettingStarted: () -> Unit) {
    Scaffold {
        Column(
            modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = stringResource(id = R.string.app_main_title),
                style = MaterialTheme.typography.caption1.copy(
                    fontSize = 24.sp,
                )
            )
            VerticalSpacer(height = 10.dp)
            Text(
                modifier = Modifier.fillMaxWidth(0.8f),
                text = stringResource(id = R.string.welcome_message_content),
                style = MaterialTheme.typography.body2.copy(
                    fontSize = 14.sp,
                    textAlign = TextAlign.Start
                )
            )
            VerticalSpacer(height = 20.dp)
            Button(
                modifier = Modifier, onClick = onGettingStarted,
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color(0x1ADDDDDD),
                    contentColor = Color.White,
                    disabledBackgroundColor = Color(0xFFF1F1F1),
                    disabledContentColor = Color(0xFF9E9E9E)
                )
            ) {
                Text(
                    modifier = Modifier.padding(start = 20.dp, end = 20.dp),
                    text = stringResource(id = R.string.getting_started_content),
                )
            }
        }
    }
}

@Preview(device = Devices.WEAR_OS_LARGE_ROUND, showSystemUi = true)
@Composable
fun DefaultPreview() {
    val onGettingStarted: () -> Unit = {}
    WelcomeScreen(onGettingStarted = onGettingStarted)
}