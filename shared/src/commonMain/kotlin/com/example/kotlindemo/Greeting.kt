package com.example.kotlindemo

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hi my name is MperMperPisang.\nI tried Kotlin Multiplatform for ${platform.name}!"
    }
}