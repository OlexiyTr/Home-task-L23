package com.example.home_task_l23_patterns.GenerativesPatterns.BuilderExample

class Car{
    fun buildBase(){
        println("Делаем корпус")
    }

    fun buildWheels(){
        println("Ставим колесо")
    }

    fun buildEngine(engine : Engine){
        println("Ставим движок: ${engine.getEngineType()}")
    }

    fun print(msg : String){
        println(msg)
    }
}