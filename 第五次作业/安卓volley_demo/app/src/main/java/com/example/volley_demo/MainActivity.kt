package com.example.volley_demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.volley_demo.ui.theme.Volley_demoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Volley_demoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainCompose()
//                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun MainCompose() {
    val cardNum = rememberSaveable { mutableStateOf("") }
    val cardExp = rememberSaveable { mutableStateOf("") }
    val cardHolderName = listOf(
        "Zhang San",
        "Li Si",
        "Wang Wu"
    )

    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(all = 5.dp)
    ) {

        CreditCard(
            cardNumber = cardNum.value,
            cardHolderName = cardHolderName.random(),
            cardExpiry = cardExp.value)

        Button(onClick = {
            volleyRequest(context = context, cardNum, cardExp)
        }) { Text(text = "Load / Re-load") }
    }
}

@Preview(showBackground = true)
@Composable
fun VolleyPreview() {
    Volley_demoTheme {
        MainCompose()
    }
}


//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    Volley_demoTheme {
//        Greeting("Android")
//    }
//}