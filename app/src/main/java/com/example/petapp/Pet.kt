package com.example.petapp

abstract class Pet(
    var name: String,
    var age: Int
) {
    abstract fun makeSound()
}
