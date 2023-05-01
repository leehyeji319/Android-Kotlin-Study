package com.example.composebasic

import android.annotation.SuppressLint
import android.graphics.Paint.Align
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composebasic.ui.theme.ComposeBasicTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        //xml 코드가 이걸로 대체된거임
        setContent {
            ComposeBasicTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("안드입니다!!!")
                }
            }
        }
    }
}

//@Composable 콤포즈 UI 뷰를 반환 ()
//콤포저블 단위 / flutter, swiftUI와 매우 유사
//특이점, 플로터와 마찬가지로 scaffold를 지원한다.

// 뷰
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Greeting(name: String) {
    Scaffold(topBar = {
        TopAppBar(title = { Text("TopAppBar") }, backgroundColor = Color.Blue)
    }
    ) {
//        Text(text = "안녕하세요")
        MyComposableView()
    }
    //이거 자체가 뷰고 뷰안에 뷰를 계속 넣을 수 있고, modifier로 스타일을 설정할 수 있다.
//    Text(text = "안녕하세요? $name!")
}

@Composable
fun MyComposableView() {
    Log.d("TAG", "MyComposableView: ")
    // 호리젠탈 리니어 레이아웃과 유사


    //버티컬 리니어
    Column(Modifier.background(Color.Green)) {
        Row(
            //여기에 패딩을 줌
            Modifier
                .padding(10.dp)
                .background(Color(0xffeaffd0)),
            verticalAlignment = Alignment.Bottom
        ) {
            Text(text = "안녕하세요?",
                Modifier
                    .padding(all = 10.dp)
                    .background(Color.Yellow))
            Spacer(modifier = Modifier.size(10.dp))
            Text(text = "안녕하세요?")
            Text(text = "안녕하세요?")
        }
        Row(
            //여기에 패딩을 줌
            Modifier
                .padding(10.dp)
                .background(Color(0xffeaffd0)),
            verticalAlignment = Alignment.Bottom
        ) {
            Text(text = "안녕하세요?",
                Modifier
                    .padding(all = 10.dp)
                    .background(Color.Yellow))
            Spacer(modifier = Modifier.size(10.dp))
            Text(text = "안녕하세요?")
            Text(text = "안녕하세요?")
        }
        Row(
            //여기에 패딩을 줌
            Modifier
                .padding(10.dp)
                .background(Color(0xffeaffd0)),
            verticalAlignment = Alignment.Bottom
        ) {
            Text(text = "안녕하세요?",
                Modifier
                    .padding(all = 10.dp)
                    .background(Color.Yellow))
            Spacer(modifier = Modifier.size(10.dp))
            Text(text = "안녕하세요?")
            Text(text = "안녕하세요?")
        }
    }
}

//미리보기는 여기서 그려준다. 여기는 그냥 미리보기일 뿐!!
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeBasicTheme {
        Greeting("안드입니다")
    }
}