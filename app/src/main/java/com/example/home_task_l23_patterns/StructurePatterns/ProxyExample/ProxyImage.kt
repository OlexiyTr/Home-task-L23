package com.example.home_task_l23_patterns.StructurePatterns.ProxyExample

class ProxyImage(private val file : String) : Image{

    private lateinit var image : RealImage

    override fun display() {
        if (image == null){
            image = RealImage(file)
        }
        image.display()
    }

}