package com.example.lab5

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
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
        MainMenu()
    }
}

@Composable
fun MainMenu() {
    val mContext = LocalContext.current

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Button(onClick = { mContext.startActivity(Intent(mContext, CampusInfo::class.java)) })
        {
            Text("Ir a Campus")
        }

        Button(onClick = { mContext.startActivity(Intent(mContext, MyProfile::class.java)) })
        {
            Text("Ir a Mi Perfil")
        }

        Button(onClick = { mContext.startActivity(Intent(mContext, Settings::class.java)) })
        {
            Text("Ir a Configuración")
        }

        Button(onClick = { mContext.startActivity(Intent(mContext, Emergency::class.java)) })
        {
            Text("Ir a Emergencias")
        }
    }
}