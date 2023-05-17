import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MainTest {

    @BeforeEach
    fun setUp() {
    }

    @AfterEach
    fun tearDown() {
    }

    @Test
    fun testConvertJpyToUsd() {
        val amount = 100.0
        val expected = 0.91
        val result = convertJpyToUsd(amount)
        assertEquals(expected, result, 0.01)
    }

    @Test
    fun testConvertCadToUsd() {
        val amount = 100.0
        val expected = 81.0
        val result = convertCadToUsd(amount)
        assertEquals(expected, result, 0.01)
    }

    @Test
    fun testConvertAudToUsd() {
        val amount = 100.0
        val expected = 76.0
        val result = convertAudToUsd(amount)
        assertEquals(expected, result, 0.01)
    }

    @Test
    fun testConvertGbpToUsd() {
        val amount = 100.0
        val expected = 139.0
        val result = convertGbpToUsd(amount)
        assertEquals(expected, result, 0.01)
    }

    @Test
    fun testConvertKwdToUsd() {
        val amount = 100.0
        val expected = 331.0
        val result = convertKwdToUsd(amount)
        assertEquals(expected, result, 0.01)
    }

    @Test
    fun testConvertBhdToUsd() {
        val amount = 100.0
        val expected = 265.0
        val result = convertBhdToUsd(amount)
        assertEquals(expected, result, 0.01)
    }

    @Test
    fun testConvertEurToUsd() {
        val amount = 100.0
        val expected = 117.0
        val result = convertEurToUsd(amount)
        assertEquals(expected, result, 0.01)
    }

    @Test
    fun testConvertChfToUsd() {
        val amount = 100.0
        val expected = 107.0
        val result = convertChfToUsd(amount)
        assertEquals(expected, result, 0.01)
    }

    @Test
    fun testConvertCnhToUsd() {
        val amount = 100.0
        val expected = 15.0
        val result = convertCnhToUsd(amount)
        assertEquals(expected, result, 0.01)
    }

    @Test
    fun testConvertCurrencyToUsd() {
        val amount = 100.0
        val currency = "JPY"
        val expected = 0.91
        val result = convertCurrencyToUsd(amount, currency)
        assertEquals(expected, result, 0.01)
    }

//    @Test(expected = IllegalArgumentException::class)
//    fun testInvalidCurrency() {
//        val amount = 100.0
//        val currency = "XYZ"
//        convertCurrencyToUsd(amount, currency)
//    }
}