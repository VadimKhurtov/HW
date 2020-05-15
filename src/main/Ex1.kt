package main

import java.util.*


class Ex1 {
    var scanner = Scanner(System.`in`)

    fun enterNum() {
        printNumber(readKeyboard())
    }

    private fun readKeyboard(): Int {
        val read = scanner.nextInt()
        return read
    }

    private fun printNumber(num: Int) {
        print("Вы ввели число: $num")
    }
}


