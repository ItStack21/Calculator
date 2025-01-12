package com.itstack.calculator.Backend

import androidx.compose.runtime.Composable

class CalculateData{
    fun add(data: String): Int{
        val nums = data.split("+")
        return nums[0].toInt() +  nums[1].toInt()
    }
    fun sub(data: String): Int{
        val nums = data.split("-")
        return nums[0].toInt() -  nums[1].toInt()
    }
    fun mul(data: String): Int{
        val nums = data.split("*")
        return nums[0].toInt() *  nums[1].toInt()
    }
    fun div(data: String): Int{
        val nums = data.split("/")
        return nums[0].toInt() /  nums[1].toInt()
    }
}

fun calculateData(data: String): Int{
    var calc = CalculateData()
    if (data.contains("+")){
         return calc.add(data)
    }
    else if (data.contains("-")){
        return calc.sub(data)
    }
    else if (data.contains("*")){
        return calc.mul(data)
    }
    else if (data.contains("/")){
        return calc.div(data)
    }

    return 0
}

