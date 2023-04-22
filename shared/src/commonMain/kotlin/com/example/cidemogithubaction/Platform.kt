package com.example.cidemogithubaction

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform