package com.example.home_task_l23_patterns.BehavioralPatterns.ChainOfResponsibilityExample

interface Payment{
    fun setNext(payment: Payment)
    fun pay()
}