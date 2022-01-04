package com.nepplus.jickbangcopy_20220104

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nepplus.jickbangcopy_20220104.models.RoomData

class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<RoomData>()   // 변수명의 m : 멤버 변수라는 표식


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add( RoomData (8000,"서울시 동대문구", 5, "1번째 방입니다."))
        mRoomList.add( RoomData (17500,"서울시 동대문구", 0, "2번째 방입니다."))
        mRoomList.add( RoomData (83600,"서울시 동대문구", 7, "3번째 방입니다."))
        mRoomList.add( RoomData (5000,"서울시 서대문구", -1, "4번째 방입니다."))
        mRoomList.add( RoomData (125000,"서울시 서대문구", 21, "5번째 방입니다."))
        mRoomList.add( RoomData (99999,"서울시 서대문구", 8, "6번째 방입니다."))
        mRoomList.add( RoomData (8500,"서울시 동작구", 1, "7번째 방입니다."))
        mRoomList.add( RoomData (12540,"서울시 동작구", 9, "8번째 방입니다."))
        mRoomList.add( RoomData (98520,"서울시 동작구", 10, "9번째 방입니다."))


    }
}