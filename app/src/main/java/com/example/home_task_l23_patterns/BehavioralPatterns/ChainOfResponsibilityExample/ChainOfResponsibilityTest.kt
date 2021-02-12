package com.example.home_task_l23_patterns.BehavioralPatterns.ChainOfResponsibilityExample

fun main(){
    val visaPayment = VisaPayment()
    val payPalPayment = PayPalPayment()
    visaPayment.setNext(payPalPayment)
    visaPayment.pay()
}