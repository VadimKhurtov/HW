package main

class Ex3 {
    fun getSeason(num: Int): String {
        return when(num) {
            1 -> "Winter"
            2 -> "Winter"
            3 -> "Spring"
            4 -> "Spring"
            5 -> "Spring"
            6 -> "Summer"
            7 -> "Summer"
            8 -> "Summer"
            9 -> "Autumn"
            10 -> "Autumn"
            11 -> "Autumn"
            12 -> "Winter"
            else -> "Wrong value"
        }
    }
}