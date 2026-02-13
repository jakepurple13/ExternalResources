package com.programmersbox.externalresources

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform