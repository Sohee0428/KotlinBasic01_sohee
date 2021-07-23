package com.example.kotlinbasic01_sohee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_test1.*

class Test1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test1)

        clickBtn.setOnClickListener {
            Log.d("큰 버튼", "수정 관련 로그")
            Log.e("큰 버튼", "에러 관련 로그")
            Log.i("큰 버튼", "정보 관련 로그")
        }

        smallBtn.setOnClickListener {
            Toast.makeText(this, "작은 버튼이 눌렸습니다.", Toast.LENGTH_SHORT).show()
        }



        val myName : String
        var myAge : Int

        myName = "sohee"
//        myName = "hi"

        myAge = 24
        myAge = 25

        val myName1 = "sohee"

        Log.d("나의 이름", myName)

        
        val userAge = 25
        
        if (userAge>= 20){
            Log.d("성인 판별","성인입니다.")
        }
        else if (userAge >= 17) {
            Log.d("성인 판별","고등학생입니다.")
        }
        else if (userAge >= 14) {
            Log.d("성인 판별","중학생입니다.")
        }
        else{
            Log.d("성인 판별","성인이 아닙니다.")
        }
        

    }




}