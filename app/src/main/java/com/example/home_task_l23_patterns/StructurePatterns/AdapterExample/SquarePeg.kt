package com.example.home_task_l23_patterns.StructurePatterns.AdapterExample

import kotlin.math.pow

class SquarePeg(val width: Double) {

    val square: Double
        get() {
            return width.pow(2.0)
        }
}