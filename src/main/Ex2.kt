package main

class Ex2 {
    fun getReversed(num: Int): Int {
        var result = 0
        var number = num
        while (number>0) {
            result = result*10 + (number % 10)
            number /= 10
        }
        return result
    }
}

