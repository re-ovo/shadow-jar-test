package me.rerere.shadowtest.api

import java.io.File

fun api(file: File) {
    file.writeText("test")
}