package test
import junit.framework.Assert.assertEquals
import main.*
import org.junit.After
import org.junit.Before
import org.junit.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream


class Tests {
    private var output = ByteArrayOutputStream()

    @Before
    fun setUpStreamPrintNumber() {
        System.setOut(PrintStream(output))
    }
    fun setUpInputPrintNumber(data: String) {
        val input = ByteArrayInputStream(data.toByteArray())
        System.setIn(input)
    }
    @Test
    fun testPrintNumber() {
        setUpInputPrintNumber("456")
        Ex1().enterNum()
        assertEquals("printNumber returns wrong result","Вы ввели число: 456", output.toString())
    }
    @After
    fun cleanTestPrintNumber() {
        System.setOut(null)
        System.setIn(null)
    }

    @Test
    fun testGetReversed() {
        val testReversed = Ex2()
        assertEquals("getReversed returns wrong result",764, testReversed.getReversed(467))
    }

    @Test
    fun testGetSeason() {
        val testSeason = Ex3()
        assertEquals("getSeason returns wrong season", "Winter", testSeason.getSeason(1))
        assertEquals("getSeason returns wrong season", "Spring", testSeason.getSeason(4))
        assertEquals("getSeason returns wrong season", "Summer", testSeason.getSeason(7))
        assertEquals("getSeason returns wrong season", "Autumn", testSeason.getSeason(10))
    }

    @Test
    fun testSortArray() {
        val arrayForSort: Array<Int> = arrayOf(4, 3, 6, -1, -7, -21, 20)
        val arrayExpected: Array<Int> = arrayOf(-21, -7, -1, 4, 3, 6, 20)
        val sortedArray = Ex4().sortArray(arrayForSort)
        assertEquals("sortArray returns wrong result", arrayExpected.contentToString(), sortedArray.contentToString())
    }

    @Before
    fun setUpStreamNumberInWords() {
        System.setOut(PrintStream(output))
    }
    @Test
    fun testGetNumberInWords() {
        val testNumberInWords = Ex5()
        testNumberInWords.getNumberInWords(0)
        assertEquals("getNumberInWords returns wrong result","ноль", output.toString())
        output.reset()
        testNumberInWords.getNumberInWords(15)
        assertEquals("getNumberInWords returns wrong result","пятнадцать", output.toString())
        output.reset()
        testNumberInWords.getNumberInWords(59)
        assertEquals("getNumberInWords returns wrong result","пятьдесят девять", output.toString())
        output.reset()
        testNumberInWords.getNumberInWords(305)
        assertEquals("getNumberInWords returns wrong result","триста пять", output.toString())
        output.reset()
        testNumberInWords.getNumberInWords(500)
        assertEquals("getNumberInWords returns wrong result","пятьсот", output.toString())
        output.reset()
        testNumberInWords.getNumberInWords(1000)
        assertEquals("getNumberInWords returns wrong result","тысяча", output.toString())
    }
    @After
    fun cleanUpStreamNumberInWords() {
        System.setOut(null)
    }


}