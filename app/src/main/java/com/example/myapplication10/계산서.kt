package com.example.myapplication10

fun main() {
    val calculator = "계산기"
    println("$calculator 시작합니다. 숫자를 입력해주세요 ")
//    var num1=70
//    var num2=30

    var num1 = readLine()!!.toInt()
    var num2 = readLine()!!.toInt()

    var plusResult = (num1 + num2)
    println("계산 결과는 $plusResult 입니다.")
    var minusResult = (num1 - num2)
    println("계산 결과는 $minusResult 입니다.")
    var multipleResult = (num1 * num2)
    println("계산 결과는 $multipleResult 입니다.")
    var divideResult = (num1 / num2)
    println("계산 결과는 $divideResult 입니다.")

    var modResult = (num1 % num2)
    println("계산결과는 $modResult 입니다.")


}