package com.example.home_task_l23_patterns.StructurePatterns.AdapterExample

import kotlin.math.pow
import kotlin.math.sqrt

class SquarePegAdapter(val peg: SquarePeg) : RoundPeg() {
    override fun getRadius(): Double {
        return sqrt((peg.width / 2).pow(2.0) * 2)
    }
}