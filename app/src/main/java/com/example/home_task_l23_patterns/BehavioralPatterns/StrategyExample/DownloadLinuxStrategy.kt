package com.example.home_task_l23_patterns.BehavioralPatterns.StrategyExample

class DownloadLinuxStrategy : Strategy{
    override fun download(file: String) {
        println("Linux download: $file")
    }
}