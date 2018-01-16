package com.practicalunittesting.chp03;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.assertEquals;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for exercises.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */

@RunWith(JUnitParamsRunner.class)
public class FahrenheitCelciusConverterTest {


    @Test
    @Parameters(method = "getCelsiusToFahrenheitParams")
    public void shouldConvertCelciusToFahrenheit(int expected, int input) {
        assertEquals(expected, FahrenheitCelciusConverter.toFahrenheit(input));
    }

    private static final Object[] getCelsiusToFahrenheitParams() {
        return $(
                $(32, 0),
                $(98, 37),
                $(212, 100)
        );
    }

    private static final Object[] getFahrenheitToCelsiusParams() {
        return $(
                $(0, 32),
                $(37, 100),
                $(100, 212)
        );
    }

    @Test
    @Parameters(method = "getFahrenheitToCelsiusParams")
    public void shouldConvertFahrenheitToCelcius(int expected, int input) {
        assertEquals(expected, FahrenheitCelciusConverter.toCelcius(input));
    }
}
