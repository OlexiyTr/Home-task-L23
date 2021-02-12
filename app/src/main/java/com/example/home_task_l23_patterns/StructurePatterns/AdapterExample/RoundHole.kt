package com.example.home_task_l23_patterns.StructurePatterns.AdapterExample

class RoundHole(val radius: Double) {
    fun fits(peg: RoundPeg): Boolean {
        return radius >= peg.getRadius()
    }

}
