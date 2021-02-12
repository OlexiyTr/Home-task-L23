package com.example.home_task_l23_patterns.GenerativesPatterns.BuilderExample

class TwoBuilderImpl() : Builder() {
    override var car: Car? = null
    override fun buildCar(): Car {
        car?.buildBase()
        car?.buildBase()
        val engineOne = OneEngine()
        car?.buildEngine(engineOne)
        val engineTwo = TwoEngine()
        car?.buildEngine(engineTwo)
        return car as Car
    }
}