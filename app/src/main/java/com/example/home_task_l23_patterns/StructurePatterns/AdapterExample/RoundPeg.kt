package com.example.home_task_l23_patterns.StructurePatterns.AdapterExample


//open class RoundPeg {
//    private var radius:Double = 0.0
//
//    open fun getRadius() : Double{
//        return radius
//    }
//
//}
open class RoundPeg {
    private var radius = 0.0

    constructor(radius : Double){
        this.radius = radius
    }

    constructor(){}

    open fun getRadius() : Double{
        return radius
    }

}