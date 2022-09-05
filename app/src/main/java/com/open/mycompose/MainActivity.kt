package com.open.mycompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard(Message("Android", "Jetpack Compose"))
        }
    }


    @Composable
    fun MessageCard(msg: Message) {
//        Row(modifier = Modifier.padding(all = 8.dp)) {
//            Image(
//                painter = painterResource(id = R.drawable.ic_launcher_background),
//                contentDescription = null,
//                modifier = Modifier
//                    .size(40.dp)
//                    .clip(CircleShape)
//            )
//            Column {
//                Text(text = msg.author)
//                Spacer(modifier = Modifier.height(4.dp))
//                Text(text = msg.body)
//            }
//        }

        Card(modifier = Modifier.padding(all = 20.dp)) {
            Column {
                Row(verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(5.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.girl),
                        contentDescription = "nothing",
                        modifier = Modifier
                            .size(80.dp)
                            .clip(CircleShape)
                    )

                    Text(
                        text = "黎神",
                        color = Color.Red,
                        fontSize = 12.sp,
                        modifier = Modifier.padding(start = 10.dp)
                    )

                    Row(modifier = Modifier.weight(1f),
                    horizontalArrangement = Arrangement.End) {
                        Text(

                            text = "张三丰"
                        )
                    }

                }
            }
        }


    }


    @Preview
    @Composable
    fun MessageCardPreview() {
        MessageCard(Message("Android", "JetPackCompose"))


    }


    data class Message(val author: String, val body: String)
}

