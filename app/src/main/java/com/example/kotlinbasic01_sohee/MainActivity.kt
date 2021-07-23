package com.example.kotlinbasic01_sohee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



//        문법 연습 (변수)

//        변수 만들기
        val myName : String  // value : 상수
        var myAge : Int  // variable : 변수


        val myName1 = "5ohee" // 변수 생성 + 대입 => 변수의 초기화

        Log.d("변수값", myName1)



        clickBtn.setOnClickListener {

            // 코드에 메모 남기기 - 주석
//            Ctrl + / : 커서가 있는 줄을 주석 처리.
//            이 {} 안에 있는 코드만, 버튼이 눌렸을 때 실행 됨.

            Log.d("메인화면로그", "클릭용 버튼이 눌림")
            Log.e("메인화면로그", "에러 관련 로그")


        }

        smallBtn.setOnClickListener {

            Toast.makeText(this, "작은 버튼 눌림", Toast.LENGTH_SHORT).show()


        }




//        문법 연습(조건문)

//        나이를 확인해서 -> 성인인지 / 아닌지

        val userAge = 25

        if (userAge >= 20){

            Log.d("성인판별", "성인이 맞습니다.")
        }
        else if (userAge >= 17){
            Log.d("성인판별", "고등학생")
        }
        else if(userAge >=14){
            Log.d("성인판별", "중학생")
        }
        else {
            Log.d("성인판별", "성인이 아닙니다.")
        }








    }

}