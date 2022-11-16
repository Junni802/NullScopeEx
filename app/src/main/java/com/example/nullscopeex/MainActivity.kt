package com.example.nullscopeex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		
		//  변수 str을 선언하고 null을 저장
		var str : String?  // 자료형 뒤에 ?를 붙임으로써 객체에 null값을 넣을 수 있게 됨
		// 보통은 객체 선언과 동시에 초기화 하는 경우가 많아 null을 넣을 일이 거의 없어 ?를 사용하는 경우가 많지 않음


		nullParam2(null)

		str = null
		Log.d("nullParam2", "${nullParam3()}")
		Log.d("nullParam2", "${nullParam4(str)}")
		Log.d("nullParam2", "${nullParam5(str)}")








	}
	//문자열 하나를 받아 그 값을 그대로 출력시키는 nullParam1() 함수를 작성(파라미터에 null 허용불가)
	fun nullParam1(x : String) : String{
		return x
	}

	// 문자열 하나를 받아 그 값을 그대로 출력시키는 nullParam2() 함수를 작성(파라미터에 null 허용)
	fun nullParam2(x : String?){
		Log.d("nullParam1", "${x}")
		Log.d("nullParam1", "${x?.length}")
	}

	// 호출하면 null 값을 리턴하는 nullParam3() 함수 작성

	fun nullParam3() : String?{
		return null
	}

	// 파라미터가 null이면 null을 아니면 문자열 길이를 리턴하는 nullParam4() 함수 작성

	fun nullParam4(x : String?) : String?{
		if(x == null){
			return null
		}else {
			return "" + x.length
		}
	}

	// 파라미터가 null이면 0을 아니면 문자열 길이를 리턴하는 nullParam5() 함수 작성

	fun nullParam5(x : String?) : Int?{
		if(x == null){
			return 0
		}else {
			return x.length
		}
	}

}

//프로퍼티를 null로 초기화 한 후 작업하는 클래스
class LateInitTest1 {
	var name : String? = null
	fun nameMake() {
		name = "홍길동"
		Log.d("lateInitTest", "name : ${name}")
	}
}
// lateInitTest1클래스의 name프로퍼티를 lateInit 방식으로 변경한 클래스 LateInitTest2 작성
class LateInitTest2 {
	val name : String? by lazy<String?> { "전우치" }
	fun	nameMake() {
		name
		Log.d("lateInitTest", "name : ${name}")
	}
}

class Rect (val width: Int, val height: Int){
	fun getArea(): Int {
		return width * height
	}
}