package com.example.home_task_l23_patterns.GenerativesPatterns.BuilderExample

abstract class Builder {
    protected open var car : Car? = null
    abstract fun buildCar(): Car
}