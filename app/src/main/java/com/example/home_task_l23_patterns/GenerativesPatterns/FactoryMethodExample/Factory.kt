package com.example.home_task_l23_patterns.GenerativesPatterns.FactoryMethodExample


class Factory {
    fun getCurrentOs(input: String) : OS? {
        var os : OS? = null
        if (input == "windows"){
            os = WindowsOs()
        } else if(input == "linux"){
            os = LinuxOs()
        }else if(input == "mac"){
            os = MacOs()
        }
        return os
    }
}