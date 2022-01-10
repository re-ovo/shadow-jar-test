package me.rerere.shadowtest

import me.rerere.shadowtest.api.api
import java.io.File

fun main() {
    File("a.txt").apply {
        if(!exists()){
            createNewFile()
        }

        // use api module
        api(this)
    }
}