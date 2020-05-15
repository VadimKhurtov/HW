package main

class Ex5 {
    fun getNumberInWords(number: Int) {
        val str1: Array<String> = arrayOf("", " один", " два", " три", " четыре", " пять", " шесть", " семь", " восемь", " девять",
            " десять", " одиннадцать", " двенадцать", " тринадцать", " четырнадцать", " пятнадцать", " шестнадцать", " семнадцать",
        " восемнадцать", " девятнадцать")
        val str10: Array<String> = arrayOf("", "", " двадцать", " тридцать", " сорок", " пятьдесят", " шестьдесят", " семьдесят", " восемьдесят", " девяносто")
        val str100: Array<String> = arrayOf("", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот", "тысяча")

        when {
            number == 0 -> print("ноль")
            number == 1000 -> print(str100[10])
            number < 20 -> print(str1[number].trim())
            else -> {
                val a = number / 100
                val b = number / 10 % 10
                val c = number % 100 % 10
                val res: String = str100[a] + str10[b] + str1[c]
                print(res.trim())
            }
        }
    }
}