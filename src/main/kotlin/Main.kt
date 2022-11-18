package org.shabunc.bugreports

interface Predictor {
    fun predict(): String = "WHATEVS"
}

// if this object will be renamed, everything works like charm
object predictor : Predictor

fun main() {
    println(predictor.predict())
}