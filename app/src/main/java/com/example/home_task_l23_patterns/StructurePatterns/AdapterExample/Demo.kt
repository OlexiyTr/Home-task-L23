package com.example.home_task_l23_patterns.StructurePatterns.AdapterExample

fun main(){
    val hole = RoundHole(5.0)
    val roundPeg = RoundPeg(5.0)
    if (hole.fits(roundPeg)){
        println("Round peg r5 fits round hole r5")
    }

    val smallSquarePeg = SquarePeg(2.0)
    val largeSquarePeg = SquarePeg(20.0)

    val smallSquarePegAdapter = SquarePegAdapter(smallSquarePeg)
    val largeSquarePegAdapter = SquarePegAdapter(largeSquarePeg)
    if (hole.fits(smallSquarePegAdapter)){
        println("Square peg w2 fits round hole r5")
    }
    if (!hole.fits(largeSquarePegAdapter)){
        println("Square peg w20 does not fit round hole r5")
    }


}