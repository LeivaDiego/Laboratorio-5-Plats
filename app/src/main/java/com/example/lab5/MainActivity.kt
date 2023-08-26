package com.example.lab5

import android.content.Context
import android.content.ContextWrapper
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab5.ui.theme.Lab5Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab5Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainMenu()
                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun MainMenuPreview() {
    Lab5Theme {
        Surface {
            MainMenu()
        }
    }
}

fun Context.findActivity(): ComponentActivity? = when (this) {
    is ComponentActivity -> this
    is ContextWrapper -> baseContext.findActivity()
    else -> null
}

@Composable
fun MainMenu() {
    val mContext = LocalContext.current
    val applogo = painterResource(id =R.drawable.uvg_logo)

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
        )
    {
        Row (horizontalArrangement = Arrangement.Center)
        {
            Text(text = "App Interactiva",
                style = TextStyle(color = Color(14, 100, 22), fontSize = 45.sp, fontWeight = FontWeight.Bold),
                modifier = Modifier.padding(20.dp))
        }
        Image(painter = applogo,
            contentDescription = "Main Menu Image",
            modifier = Modifier
                .size(320.dp)
                .padding(bottom = 20.dp))

        Button(
            onClick = { mContext.startActivity(Intent(mContext, CampusInfo::class.java)) },
            colors = ButtonDefaults.buttonColors(containerColor = Color(21, 115, 32)),
            modifier = Modifier.width(350.dp).height(80.dp).padding(10.dp)        )
        {
            Text("Ir a Campus", fontSize = 30.sp)
        }

        Button(
            onClick = { mContext.startActivity(Intent(mContext, MyProfile::class.java)) },
            colors = ButtonDefaults.buttonColors(containerColor = Color(21, 115, 32)),
            modifier = Modifier.width(350.dp).height(80.dp).padding(10.dp)        )
        {
            Text("Ir a Mi Perfil", fontSize = 30.sp)
        }

        Button(
            onClick = { mContext.startActivity(Intent(mContext, Settings::class.java)) },
            colors = ButtonDefaults.buttonColors(containerColor = Color(21, 115, 32)),
            modifier = Modifier.width(350.dp).height(80.dp).padding(10.dp)
        )
        {
            Text("Ir a Configuración", fontSize = 30.sp)
        }

        Button(
            onClick = { mContext.startActivity(Intent(mContext, Emergency::class.java)) },
            colors = ButtonDefaults.buttonColors(containerColor = Color(21, 115, 32)),
            modifier = Modifier.width(350.dp).height(80.dp).padding(10.dp)            )
        {
            Text("Ir a Emergencias", fontSize = 30.sp)
        }
    }
}