package com.example.calculator

sealed class CalcOperation (val symbol:String){
    object Add :CalcOperation("+")
    object Subtract :CalcOperation("-")
    object Multiply:CalcOperation("x")
    object Divide:CalcOperation("/")
}