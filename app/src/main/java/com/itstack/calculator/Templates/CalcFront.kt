package com.itstack.calculator.Templates

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.Icons.Default
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.itstack.calculator.R
import androidx.compose.runtime.*
import com.itstack.calculator.Backend.calculateData
import com.itstack.calculator.ui.theme.CUSTOM_KEYBOARD

@Composable
@Preview(showBackground = true)
fun calc(){
    var input by remember { mutableStateOf("") }
    var output by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize()
            .background(Color.Black)
    ) {
        Column (
            modifier = Modifier.fillMaxSize()
                .padding(top = 35.dp, bottom = 40.dp)
                .background(Color.Black)
        ){
            Row(
                modifier = Modifier
                    .background(Color.Black)
                    .weight(0.5f)
                    .fillMaxWidth()
                    .padding(10.dp),
                horizontalArrangement = Arrangement.End

            ) {
                Image(
                    painter = painterResource(id = R.drawable.time),
                    contentDescription = "Add Icon",
                    modifier = Modifier.size(50.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.currency),
                    contentDescription = "Add Icon",
                    modifier = Modifier.size(50.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.scale),
                    contentDescription = "Add Icon",
                    modifier = Modifier.size(50.dp)
                )
            }
            Row(
                modifier = Modifier
                    .background(Color.Black)
                    .weight(3.5f)
                    .fillMaxWidth()

            ) {
                Column (
                    modifier = Modifier.fillMaxSize()
                ){
                    Row (
                        modifier = Modifier.fillMaxWidth()
                            .weight(6f),
                        horizontalArrangement = Arrangement.End,
                        verticalAlignment = Alignment.Bottom
                    ){
                        Text(text = "$input",
                            color = Color.White,
                            fontSize = 50.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Row (
                        modifier = Modifier.fillMaxWidth()
                            .weight(4f),
                        horizontalArrangement = Arrangement.End
                    ){
                        Text(text = "${output}",
                            color = Color.Gray,
                            fontSize = 40.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
            Row(
                modifier = Modifier
                    .background(Color.Red)
                    .weight(5f)
                    .fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f)
                            .fillMaxHeight()
                    ) {
                        Button(
                            onClick = {
                                input = ""
                                output = ""
                            },
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxHeight(),
                            shape = RectangleShape,
                            colors = ButtonDefaults.buttonColors(containerColor = CUSTOM_KEYBOARD)
                        ) {
                            Text(
                                text = "C",
                                fontSize = 70.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Red

                            )
                        }
                        Button(
                            onClick = {  },
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxHeight(),
                            shape = RectangleShape,
                            colors = ButtonDefaults.buttonColors(containerColor = CUSTOM_KEYBOARD),
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.percent),
                                contentDescription = "Add Icon",
                                modifier = Modifier.size(80.dp)
                            )
                        }
                        Button(
                            onClick = {
                                if (input.length > 0){
                                    input = input.substring(0, input.length - 1)
                                }
                            },
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxHeight(),
                            shape = RectangleShape,
                            colors = ButtonDefaults.buttonColors(containerColor = CUSTOM_KEYBOARD),
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.left),
                                contentDescription = "Add Icon",
                                modifier = Modifier.size(80.dp)
                            )
                        }
                        Button(
                            onClick = { input+="/" },
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxHeight(),
                            shape = RectangleShape,
                            colors = ButtonDefaults.buttonColors(containerColor = CUSTOM_KEYBOARD),
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.divide),
                                contentDescription = "Add Icon",
                                modifier = Modifier.size(80.dp)
                            )
                        }
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.Yellow)
                            .weight(1f)
                            .fillMaxHeight()
                    ) {
                        Button(
                            onClick = {
                                input= input + "7"
                            },
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxHeight(),
                            shape = RectangleShape,
                            colors = ButtonDefaults.buttonColors(containerColor = CUSTOM_KEYBOARD)
                        ) {
                            Text(
                                text = "7",
                                fontSize = 70.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White

                            )
                        }
                        Button(
                            onClick = {
                                input= input + "8"
                            },
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxHeight(),
                            shape = RectangleShape,
                            colors = ButtonDefaults.buttonColors(containerColor = CUSTOM_KEYBOARD),
                        ) {
                            Text(
                                text = "8",
                                fontSize = 70.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White

                            )
                        }
                        Button(
                            onClick = {
                                input= input + "9"
                            },
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxHeight(),
                            shape = RectangleShape,
                            colors = ButtonDefaults.buttonColors(containerColor = CUSTOM_KEYBOARD),
                        ) {
                            Text(
                                text = "9",
                                fontSize = 70.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White

                            )
                        }
                        Button(
                            onClick = { input+="*" },
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxHeight(),
                            shape = RectangleShape,
                            colors = ButtonDefaults.buttonColors(containerColor = CUSTOM_KEYBOARD),
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.close),
                                contentDescription = "Add Icon",
                                modifier = Modifier.size(80.dp)
                            )
                        }
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.Yellow)
                            .weight(1f)
                            .fillMaxHeight()
                    ) {
                        Button(
                            onClick = {
                                input= input + "4"
                            },
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxHeight(),
                            shape = RectangleShape,
                            colors = ButtonDefaults.buttonColors(containerColor = CUSTOM_KEYBOARD)
                        ) {
                            Text(
                                text = "4",
                                fontSize = 70.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                        }
                        Button(
                            onClick = {
                                input= input + "5"
                            },
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxHeight(),
                            shape = RectangleShape,
                            colors = ButtonDefaults.buttonColors(containerColor = CUSTOM_KEYBOARD),
                        ) {
                            Text(
                                text = "5",
                                fontSize = 70.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White

                            )
                        }
                        Button(
                            onClick = {
                                input= input + "6"
                            },
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxHeight(),
                            shape = RectangleShape,
                            colors = ButtonDefaults.buttonColors(containerColor = CUSTOM_KEYBOARD),
                        ) {
                            Text(
                                text = "6",
                                fontSize = 70.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White

                            )
                        }
                        Button(
                            onClick = { input+="-" },
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxHeight(),
                            shape = RectangleShape,
                            colors = ButtonDefaults.buttonColors(containerColor = CUSTOM_KEYBOARD),
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.minus),
                                contentDescription = "Add Icon",
                                modifier = Modifier.size(80.dp)
                            )
                        }
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.Yellow)
                            .weight(1f)
                            .fillMaxHeight()
                    ) {
                        Button(
                            onClick = {
                                input= input + "1"
                            },
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxHeight(),
                            shape = RectangleShape,
                            colors = ButtonDefaults.buttonColors(containerColor = CUSTOM_KEYBOARD)
                        ) {
                            Text(
                                text = "1",
                                fontSize = 70.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White

                            )
                        }
                        Button(
                            onClick = {
                                input= input + "2"
                            },
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxHeight(),
                            shape = RectangleShape,
                            colors = ButtonDefaults.buttonColors(containerColor = CUSTOM_KEYBOARD),
                        ) {
                            Text(
                                text = "2",
                                fontSize = 70.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White

                            )
                        }
                        Button(
                            onClick = {
                                input= input + "3"
                            },
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxHeight(),
                            shape = RectangleShape,
                            colors = ButtonDefaults.buttonColors(containerColor = CUSTOM_KEYBOARD),
                        ) {
                            Text(
                                text = "3",
                                fontSize = 70.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White

                            )
                        }
                        Button(
                            onClick = { input+="+" },
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxHeight(),
                            shape = RectangleShape,
                            colors = ButtonDefaults.buttonColors(containerColor = CUSTOM_KEYBOARD),
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.add),
                                contentDescription = "Add Icon",
                                modifier = Modifier.size(80.dp)
                            )
                        }
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.Yellow)
                            .weight(1f)
                            .fillMaxHeight()
                    ) {
                        Button(
                            onClick = {  },
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxHeight(),
                            shape = RectangleShape,
                            colors = ButtonDefaults.buttonColors(containerColor = CUSTOM_KEYBOARD)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.rotate),
                                contentDescription = "Add Icon",
                                modifier = Modifier.size(80.dp)
                            )
                        }
                        Button(
                            onClick = {
                                input= input + "0"
                            },
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxHeight(),
                            shape = RectangleShape,
                            colors = ButtonDefaults.buttonColors(containerColor = CUSTOM_KEYBOARD),
                        ) {
                            Text(
                                text = "0",
                                fontSize = 70.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White

                            )
                        }
                        Button(
                            onClick = {  },
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxHeight(),
                            shape = RectangleShape,
                            colors = ButtonDefaults.buttonColors(containerColor = CUSTOM_KEYBOARD),
                        ) {
                            Text(
                                text = ".",
                                fontSize = 70.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White

                            )
                        }
                        Button(
                            onClick = { output = calculateData(input).toString() },
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxHeight(),
                            shape = RectangleShape,
                            colors = ButtonDefaults.buttonColors(containerColor = CUSTOM_KEYBOARD),
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.equal),
                                contentDescription = "Add Icon",
                                modifier = Modifier.size(80.dp)
                            )
                        }
                    }
                }

            }

        }
    }
}

