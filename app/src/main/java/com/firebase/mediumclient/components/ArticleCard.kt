package com.firebase.mediumclient.components


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Send
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.firebase.mediumclient.R

val fontFamily = FontFamily (
    Font(R.font.inter_extrabold, FontWeight.ExtraBold),
    Font(R.font.inter_extralight, FontWeight.ExtraLight),
)


@Composable
fun ArticleCard(){
    Surface(modifier = Modifier.size(308.dp, 142.dp), elevation = 8.dp, shape = RoundedCornerShape(10.dp)) {
        Column(Modifier.padding(horizontal = 10.dp)) {
            Row(Modifier.padding(vertical = 9.dp)) {
                Text(text = "Topic",
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.ExtraLight,
                    fontSize = 10.sp,
                    modifier = Modifier
                        .border(
                            width = 1.dp,
                            color = Color.Gray,
                            shape = RoundedCornerShape(10.dp)
                        )
                        .padding(vertical = 3.dp, horizontal = 9.dp)
                        .border(
                            width = 1.dp,
                            color = Color.White
                        )
                )
                Text(text = "2 min read",           
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.ExtraLight,
                    fontSize = 9.sp,
                    modifier = Modifier.padding(4.dp, 2.dp, 161.dp,0.dp)
                )
                Text(text = "14 May", fontSize = 9.sp)
            }
            Row {
                Image(painter = painterResource(id = R.drawable.random_img),
                    contentDescription = "Random image",
                    modifier = Modifier
                        .size(62.dp)
                        .clip(RoundedCornerShape(7.dp)))
                Column (modifier = Modifier.padding(horizontal = 6.dp)) {
                    Text(text = "Title",
                        fontFamily = fontFamily,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Text(text = """
                        Lorem ipsum dolor sit amet,consectetur adipiscing 
                        elit.In aliquam metus neque, nec iaculis lacus a
                        liquam quis. Aenean in dignissim arcu. Phasellus 
                        varius magna non congue imperdiet... 
                    """.trimIndent(),
                        fontSize = 8.sp,
                        fontFamily = FontFamily.SansSerif,
                        color = Color.DarkGray,
                        fontWeight = FontWeight.Normal
                    )
                }
            }
            Row(modifier = Modifier.padding(vertical = 10.dp)) {
                Text(text = "by", fontSize = 10.sp, modifier =  Modifier.padding(0.dp, 2.dp, 4.dp,0.dp), color = Color.Gray)
                Image(painter = painterResource(R.drawable.profile_user), contentDescription = "Profile" ,
                    modifier = Modifier
                        .size(20.dp)
                        .clip(CircleShape)
                )
                Text(text = "User Name", fontSize = 11.sp, modifier =  Modifier.padding(5.dp, 3.dp, 170.dp,0.dp), color = Color.Gray)
                Icon(painter = painterResource(id = R.drawable.bookmark_add), contentDescription ="bookmark add" )
            }
        }
    }
}
