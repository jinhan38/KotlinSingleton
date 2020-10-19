package com.kotlinsingleton

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper


//매개변수를 가진 싱글톤
class MySQLSingleton private constructor(context: Context) :
    SQLiteOpenHelper(context, "my DB 2", null, 2) {

    companion object {
        //자기 자신 변수선언
        // volatile은 cpu의 캐시를 거치지 않고 바로 메인 메모리로 가서 항상 최신값을 가져올 수 있음
        @Volatile
        private var instance: MySQLSingleton? = null

        //자기 자신 가져오기
        //instance가 null이라면 synchronize 자기 자시
        fun getInstance(context: Context): MySQLSingleton =
            instance ?: synchronized(this) {
                instance ?: MySQLSingleton(context).also {
                    instance = it
                }
            }
    }

    override fun onCreate(p0: SQLiteDatabase?) {
        TODO("Not yet implemented")
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }

}