package com.example.home_task_l23_patterns.StructurePatterns.ProxyExample


class RealImage(private val file: String) : Image {

    init {
        load(file)
    }

    private fun load(file: String) {
        println("Загрузка ${file}")
    }

    override fun display() {
        println("Просмотр ${file}")
    }

}

