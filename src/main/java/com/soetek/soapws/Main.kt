package com.soetek.soapws

import java.io.FileReader
import java.util.Scanner

fun main() {
    println("Hello");
    val scanner = Scanner(System.`in`)
    val score = scanner.nextLine().toInt()
//    val input = scanner.nextLine()
//    val score = Integer.parseInt(input)
//    println(score+5)
    val s = FileReader("abc.txt").buffered().lines().forEach {
        println(it)
    }
    println(s)
}