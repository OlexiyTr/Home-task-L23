package com.example.home_task_l23_patterns.GenerativesPatterns.BuilderExample

class Build {
    private lateinit var builder : Builder
    constructor(i : Int){
        if (i == 1){
            builder = OneBuilderImpl()
        }else if(i == 2){
            builder = TwoBuilderImpl()
        }
    }
    fun buildCar() : Car{
        return builder.buildCar()
    }
}