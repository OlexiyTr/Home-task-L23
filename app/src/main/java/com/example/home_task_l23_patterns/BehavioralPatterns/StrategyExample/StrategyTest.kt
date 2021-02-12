package com.example.home_task_l23_patterns.BehavioralPatterns.StrategyExample

fun main(){
    val context = Context(DownloadWindowsStrategy())
    context.download("file.txt")

    val contextSecond = Context(DownloadLinuxStrategy())
    contextSecond.download("file2.txt")
}