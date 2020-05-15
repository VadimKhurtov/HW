package main

class Ex1 {

    fun enterNum() {
        printNumber(readKeyboard())
    }

    private fun readKeyboard(): Int {
        val read = readLine()
        return read?.toInt()!!
    }

    private fun printNumber(num: Int) {
        print("Вы ввели число: $num")
    }
}


