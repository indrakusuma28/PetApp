package com.example.petapp

class Dog(
    name: String,
    age: Int,
    var breed: String
) : Pet(name, age) {
    override fun makeSound() {
        println("Woof! Woof!")
    }
}
