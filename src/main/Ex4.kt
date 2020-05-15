package main

class Ex4 {
    fun sortArray(array: Array<Int>): Array<Int> {
        val list: MutableList<Int> = mutableListOf()
        for (i in array) {
            if (i < 0) list.add(0, i)
            else list.add(i)
        }
        return list.toTypedArray()
    }
}