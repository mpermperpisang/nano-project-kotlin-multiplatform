package com.example.kotlindemo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform