package com.example.petapp

class Cat(
    name: String,
    age: Int,
    var color: String
) : Pet(name, age) {
    override fun makeSound() {
        println("Meow! Meow!")
    }
}
