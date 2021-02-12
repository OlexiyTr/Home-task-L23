package com.example.home_task_l23_patterns.BehavioralPatterns.StrategyExample

class DownloadWindowsStrategy : Strategy{
    override fun download(file: String) {
        println("Windows download: $file")
    }
}