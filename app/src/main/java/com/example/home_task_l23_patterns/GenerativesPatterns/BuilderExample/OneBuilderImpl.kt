package com.example.home_task_l23_patterns.GenerativesPatterns.BuilderExample

class OneBuilderImpl() : Builder() {
    override var car: Car? = null
    override fun buildCar(): Car {
        car?.buildBase()
        car?.buildBase()
        val engine = OneEngine()
        car?.buildEngine(engine)
        return car as Car


    }

}