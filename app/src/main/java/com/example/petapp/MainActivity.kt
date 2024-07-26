package com.example.petapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Membuat objek Dog dan Cat
        val dog: Pet = Dog("Buddy", 3, "Golden Retriever")
        val cat: Pet = Cat("Whiskers", 2, "Black")

        // Mendapatkan referensi ke TextView di layout
        val dogInfo: TextView = findViewById(R.id.dogInfo)
        val catInfo: TextView = findViewById(R.id.catInfo)

        // Menampilkan informasi hewan peliharaan
        dogInfo.text = "Dog: ${dog.name}, Age: ${dog.age}, Breed: ${(dog as Dog).breed}"
        catInfo.text = "Cat: ${cat.name}, Age: ${cat.age}, Color: ${(cat as Cat).color}"

        // Membuat suara hewan peliharaan
        dog.makeSound()
        cat.makeSound()
    }
}
