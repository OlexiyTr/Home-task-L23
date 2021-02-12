package com.example.home_task_l23_patterns.GenerativesPatterns.FactoryMethodExample

fun main(){
    val win = "linux"
    val factory = Factory()
    val os = factory.getCurrentOs(win)
    os?.getOs()
}