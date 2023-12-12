/**
 * 주차장의 요금표와 차량이 들어오고 나간 기록이 주어졌을때, 차량별로 주차 요금을 계산하려고함.
 * fees : [기본시간(분),기본 요금(원),단위 시간(분),단위 요금(원)]
 * records : [시각 ,차량번호 , 내역]
 *
 * 1, 출자 내역이 없을시, 23:59 에 출차 한 걸로 간주
 * 2, 24시간 누적 주차시간을 계산하여 일괄로 출력
 * 3, 기본 시간 이하 << 기본요금을 청구
 * 4, 기본 시간 초과 << 기본요금 + 단위시간마다 단위요금
 * 5, 단위 시간 을 나눌때, 올림으로 처리
 *
 */

class Fees(){
    constructor(time:String,num:String,inOut :String){
        if(inOut=="IN"){
            this.fromTime = timeToDec(time)
            this.carNum = num
            isInput = true
        }
        else{

            this.toTime = timeToDec(time)
            this.carNum = num
            isInput = true
        }
    }

    var fee :Int =-1
    var carNum:String =""
    var isInput = false

    //시간
    var fromTime :Int =-1
    var toTime :Int = -1
    fun timeToDec(s : String):Int{//05:34 형태로 들어온다 --> 334로 반환
        var answer = 0
        val list = s.split(":")
        val time = list[0].toInt()*60
        val minute = list[1].toInt()
        answer = time + minute
        return answer
    }
    fun checkInOut(fees :IntArray,li :List<String>):Fees{ //기능 함수
        //#1 기본시간 이하인가
        //#2 기본시간 초과이면,기본요금 + 초과한시간을계산
        //#3 만약 출차된 내역이 없다면 23:59로 처리.
        return Fees()
    }

}
class Solution {

    fun solution(fees: IntArray, records: Array<String>): IntArray { //fees : [기본시간,기본요금,단위시간,단위요금]
        var answer: IntArray = intArrayOf()
        var strList = listOf<String>() // [시간,번호,내역]
        var inOutSet = mutableSetOf<Fees>()
        records.forEach{
            //주여진 배열에 처리, 처리되면 answer 에 값넣기
            strList = it.split(" ") //문자열 분리
            var record = Fees() //인스턴스 생성
        }
        return answer
    }
}

fun main(){
    var a = Solution()
    a.solution(intArrayOf(180,5000,10,600),arrayOf("05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"))
    //14600,34400,5000
    a.solution(intArrayOf(120,0,60,591), arrayOf("16:00 3961 IN","16:00 0202 IN","18:00 3961 OUT","18:00 0202 OUT","23:58 3961 IN"))
    //0,590
    a.solution(intArrayOf(1,461,1,10), arrayOf("00:00 1234 IN"))
    //14841
}