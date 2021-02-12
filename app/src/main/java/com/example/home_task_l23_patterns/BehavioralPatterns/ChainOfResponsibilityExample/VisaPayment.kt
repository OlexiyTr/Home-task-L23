package com.example.home_task_l23_patterns.BehavioralPatterns.ChainOfResponsibilityExample

class VisaPayment : Payment{

    private lateinit var payment: Payment

    override fun setNext(payment: Payment) {
        this.payment = payment
    }

    override fun pay() {
        println("Visa Payment")
    }

}