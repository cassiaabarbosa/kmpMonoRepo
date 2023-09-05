package com.example.degrees

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class CommonGreetingTest {

    private val converter: TemperatureConverter = TemperatureConverter()

    @Test
    fun celsiusToFahrenheit() {
        val result = converter.celsiusToFahrenheit(celsius = 0.00)
        val expectedResult: Double = 32.0
        assertEquals(result, expectedResult)
    }

    @Test
    fun celsiusToKelvin() {
        val result = converter.celsiusToKelvin(celsius = 0.00)
        val expectedResult: Double = 273.15
        assertEquals(result, expectedResult)
    }

    @Test
    fun fahrenheitToCelsius() {
        val value = converter.fahrenheitToCelsius(fahrenheit = 0.00)
        val expectedValue: Double = -17.77777777777778
        assertEquals(value, expectedValue)
    }

    @Test
    fun fahrenheitToKelvin() {
        val value = converter.fahrenheitToKelvin(fahrenheit = 0.00)
        val expectedValue: Double = -255.3722222222222
        assertEquals(value, expectedValue)
    }

    @Test
    fun kelvinToCelsius() {
        val value = converter.kelvinToCelsius(kelvin = 0.00)
        val expectedValue: Double = -273.15
        assertEquals(value, expectedValue)
    }

    @Test
    fun kelvinToFahrenheit() {
        val value = converter.kelvinToFahrenheit(kelvin = 0.00)
        val expectedValue: Double = -459.66999999999996
        assertEquals(value, expectedValue)
    }
}