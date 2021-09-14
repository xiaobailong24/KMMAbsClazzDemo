package com.kmm.abs.clazz.demo

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}