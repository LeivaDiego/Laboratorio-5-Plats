package com.example.lab5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab5.ui.theme.Lab5Theme

class MyProfile : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab5Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyProfilePage()
                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun MyProfilePreview() {
    Lab5Theme {
        MyProfilePage()
    }
}

@Composable
fun MyProfilePage(){
    Surface {
        Column (modifier = Modifier.verticalScroll(rememberScrollState()))
        {
            Profile()
            Menu()
        }
    }
}

@Composable
fun Profile(){
    val avatar = painterResource(id = R.drawable.profile_pic)
    val configur = painterResource(id = R.drawable.settings)
    val bgprofile = painterResource(id = R.drawable.profile_background)
    val circulo = painterResource(id = R.drawable.circle)

    Column(horizontalAlignment = Alignment.CenterHorizontally)
    {
        Row (horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth())
        {
            Text(text = "   ")

            Text(text = "Mi Perfil",
                style = TextStyle(color = Color.Black, fontSize = 26.sp, fontWeight = FontWeight.Bold),
                modifier = Modifier.padding(20.dp))

            Image(painter = configur,
                contentDescription = "Settings logo", Modifier.absoluteOffset(0.dp,25.dp))
        }

        Box (
            Modifier
                .fillMaxWidth()
                .height(200.dp))
        {
            Image(painter = bgprofile,
                contentDescription = "Background",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(150.dp)
                    .alpha(0.6f))

            Image(painter = circulo,
                contentDescription = "Circle",
                modifier = Modifier
                    .size(150.dp)
                    .align(Alignment.Center)
                    .absoluteOffset(0.dp, 40.dp))

            Image(painter = avatar,
                contentDescription = "Profile Avatar",
                modifier = Modifier
                    .size(150.dp)
                    .align(Alignment.Center)
                    .absoluteOffset(0.dp, 40.dp))
        }

        Text(text = "DIEGO ALBERTO LEIVA PÉREZ",
            style = TextStyle(color = Color.Black, fontSize = 20.sp, fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(20.dp))
    }
}

@Composable
fun Menu(){
    val calendar = painterResource(id = R.drawable.calendar)
    val mygroups = painterResource(id = R.drawable.groups)
    val grades = painterResource(id = R.drawable.outline_task_24)
    val schedule = painterResource(id = R.drawable.schedule)
    val friends = painterResource(id = R.drawable.friends)
    val courses = painterResource(id = R.drawable.courses)
    val campus = painterResource(id = R.drawable.campus)

    Column (Modifier.fillMaxWidth())
    {
        Divider(color = Color.Gray, thickness = 1.dp)

        Row {
            Image(painter = campus,
                contentDescription = "MyCampus logo",
                modifier = Modifier
                    .size(40.dp)
                    .absoluteOffset(0.dp, 15.dp))

            Column {
                Text(text = "Mi Campus",
                    style = TextStyle(color = Color.Black, fontSize = 20.sp),
                    modifier = Modifier
                        .padding(horizontal = 20.dp)
                        .padding(top = 10.dp))

                Text(text = "Campus Central",
                    style = TextStyle(color = Color.Black, fontSize = 15.sp),
                    modifier = Modifier
                        .padding(horizontal = 20.dp)
                        .padding(bottom = 10.dp))
            }
        }

        Divider(color = Color.Gray, thickness = 1.dp)

        Row {
            Image(painter = friends,
                contentDescription = "MyFriends logo",
                modifier = Modifier
                    .size(40.dp)
                    .absoluteOffset(0.dp, 15.dp) )

            Text(text = "Mis Amigos",
                style = TextStyle(color = Color.Black, fontSize = 20.sp),
                modifier = Modifier.padding(20.dp))
        }

        Divider(color = Color.Gray, thickness = 1.dp)

        Row {
            Image(painter = calendar,
                contentDescription = "MyCalendar logo",
                modifier = Modifier
                    .size(40.dp)
                    .absoluteOffset(0.dp, 15.dp))

            Text(text = "Mi Calendario",
                style = TextStyle(color = Color.Black, fontSize = 20.sp),
                modifier = Modifier.padding(20.dp))
        }

        Divider(color = Color.Gray, thickness = 1.dp)

        Row {
            Image(painter = courses,
                contentDescription = "MyCourses logo",
                modifier = Modifier
                    .size(40.dp)
                    .absoluteOffset(0.dp, 15.dp))

            Text(text = "Mis Cursos",
                style = TextStyle(color = Color.Black, fontSize = 20.sp),
                modifier = Modifier.padding(20.dp))
        }

        Divider(color = Color.Gray, thickness = 1.dp)

        Row {
            Image(painter = grades,
                contentDescription = "MyGrades logo",
                modifier = Modifier
                    .size(40.dp)
                    .absoluteOffset(0.dp, 15.dp))

            Text(text = "Mis Calificaciones",
                style = TextStyle(color = Color.Black, fontSize = 20.sp),
                modifier = Modifier.padding(20.dp))
        }

        Divider(color = Color.Gray, thickness = 1.dp)

        Row {
            Image(painter = mygroups,
                contentDescription = "MyGroups logo",
                modifier = Modifier
                    .size(40.dp)
                    .absoluteOffset(0.dp, 15.dp))

            Text(text = "Mis Grupos",
                style = TextStyle(color = Color.Black, fontSize = 20.sp),
                modifier = Modifier.padding(20.dp))
        }

        Divider(color = Color.Gray, thickness = 1.dp)

        Row {
            Image(painter = schedule,
                contentDescription = "MyEvents logo",
                modifier = Modifier
                    .size(40.dp)
                    .absoluteOffset(0.dp, 15.dp))

            Text(text = "Mis Eventos Proximos",
                style = TextStyle(color = Color.Black, fontSize = 20.sp),
                modifier = Modifier.padding(20.dp))
        }
    }
}