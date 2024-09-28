package example.myapp

import java.lang.Math.PI

open class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {
    open var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = ((value * 1000) / (width * length))
        }
    open val shape = "rectangle"
    open var water: Double = 0.0
        get() = volume * 0.9

    init {
        println("aquarium initializing")
    }
    init {
        println("Volume: ${width * length * height / 1000} liters")
    }

    fun printSize() {
        println(shape)
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
        println("Volume: $volume liters Water: $water liters (${water / volume * 100.0}% full)")
    }
}
