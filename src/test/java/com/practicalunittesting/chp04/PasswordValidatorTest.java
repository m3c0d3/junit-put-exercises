package com.practicalunittesting.chp04;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by m3c0d3 on 1/3/2018.
 */
public class PasswordValidatorTest {

    @Test
    public void shouldBe5CharactersLong() {
        Assert.assertTrue(PasswordValidator.validate("aa1aaa"));
        Assert.assertFalse(PasswordValidator.validate("a1aa"));
    }

    @Test
    public void shouldHaveAtLeastOneDigit() {
        Assert.assertTrue(PasswordValidator.validate("a1ffaa"));
        Assert.assertFalse(PasswordValidator.validate("adssda"));
    }
}
