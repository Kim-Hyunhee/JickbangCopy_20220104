package com.nepplus.jickbangcopy_20220104.models

class RoomData(
//    객체 변수 만들어주기 자료형을 무조건 다 적어줘야 함
    val price : Int,
    val address : String,
    val floor : Int,
    val description : String,  // 파이썬과 같이 추가로 들어올 파라미터가 없어도 ,로 마무리해도 됨
) {

    fun getFormattedFloor() : String{

        if (this.floor > 0) {
            return "${ this.floor }층"  // 2층, 3층...
        }
        else if (this.floor < 0) {
            return "지하 ${-this.floor}층"  // 지하 1층
        }
        else {
            return "반지하"  // 양수도 음수도 아닌 건 0 밖에 없다.
        }

    }
}