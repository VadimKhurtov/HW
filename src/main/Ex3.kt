package main

class Ex3 {
    fun getSeason(num: Int): String {
        when(num) {
            1 -> return "Winter"
            2 -> return "Winter"
            3 -> return "Spring"
            4 -> return "Spring"
            5 -> return "Spring"
            6 -> return "Summer"
            7 -> return "Summer"
            8 -> return "Summer"
            9 -> return "Autumn"
            10 -> return "Autumn"
            11 -> return "Autumn"
            12 -> return "Winter"
            else -> return "Wrong value"
        }
    }
}