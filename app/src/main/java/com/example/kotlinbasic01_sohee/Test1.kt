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



    }




}