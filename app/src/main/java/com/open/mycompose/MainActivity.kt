package com.open.mycompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import coil.transform.CircleCropTransformation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard(Message("Android", "Jetpack Compose"))
        }
    }


    @Composable
    fun MessageCard(msg: Message) {
        Card(modifier = Modifier.padding(all = 10.dp)) {
            Column(modifier = Modifier.padding(10.dp)) {
                Row(
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.girl),
                        contentDescription = "nothing",
                        modifier = Modifier
                            .size(20.dp)
                            .clip(CircleShape)
                    )

                    Column {
                        Text(
                            text = "黎明",
                            modifier = Modifier.padding(start = 10.dp)
                        )
//                        Spacer(modifier = Modifier.padding(10.dp))
//                        Text(
//                            text = "张学友",
//                            color = Color.Black,
//                            style = MaterialTheme.typography.subtitle1,
//                            modifier = Modifier.padding(start = 10.dp)
//                        )
                    }


                    Row(
                        modifier = Modifier.weight(1f),
                        horizontalArrangement = Arrangement.End
                    ) {
                        Text(
                            text = "张三丰"
                        )
                    }

                }
                Spacer(modifier = Modifier.padding(top = 5.dp, end = 5.dp))
                Row(){
                    Text(
                        text = "正文主要内容部分",
                        style = MaterialTheme.typography.body1
                    )
                }
                Image(painter = rememberImagePainter(
                    builder = {
                        //圆形图片
                        transformations(CircleCropTransformation())},
                    data = "https://img2.baidu.com/it/u=3255162423,1467500944&fm=253&fmt=auto&app=138&f=JPEG?w=587&h=500"),
                    contentDescription = null,
                    modifier = Modifier.size(100.dp).clip(CircleShape))

                Row(modifier = Modifier.padding(top = 10.dp)){
                    Text(
                        text = "底部标题"
                    )
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

