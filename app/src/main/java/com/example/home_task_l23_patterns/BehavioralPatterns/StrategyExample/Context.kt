package com.example.home_task_l23_patterns.BehavioralPatterns.StrategyExample

class Context(private val strategy: Strategy){
    fun download(file : String){
        strategy.download(file)
    }
}