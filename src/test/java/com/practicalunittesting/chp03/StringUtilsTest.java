package com.practicalunittesting.chp03;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junitparams.JUnitParamsRunner.$;


/**
 * Created by m3c0d3 on 1/2/2018.
 */
@RunWith(JUnitParamsRunner.class)
public class StringUtilsTest {
    private StringUtils stringUtils;

    @Before
    public void setUp() {
        stringUtils = new StringUtils();
    }

    private static final Object[] getValidInputAndExpected() {
        return $(
                $("USD", "DSU"),
                $("EUR", "RUE"),
                $("", ""),
                $("aB a", "a Ba")
        );
    }

    @Test
    @Parameters(method = "getValidInputAndExpected")
    public void testSimpleStrings(String input, String expected) {
        //
        String reversed = stringUtils.reverse(input);

        //
        Assert.assertTrue(reversed.equals(expected));
    }

    @Test(expected = NullPointerException.class)
    public void shouldThrowNPException() {
        stringUtils.reverse(null);
    }
}
