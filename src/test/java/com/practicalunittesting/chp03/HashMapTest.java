package com.practicalunittesting.chp03;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

/**
 * Created by m3c0d3 on 1/3/2018.
 */
public class HashMapTest {

    private HashMap<Object, Object> hashMap;

    @Before
    public void setUp() {
        hashMap = new HashMap<>();
    }

    @Test
    public void testWhenStoredThenCanBeRetrieved() {
        //
        int value = 1;
        String key = "test";

        //
        hashMap.put(key, value);

        //
        Assert.assertSame(value, hashMap.get(key));
    }

    @Test
    public void testWhenAddedTwiceThenReplaced() {
        //
        int value = 1;
        String key = "test";
        int secondValue = 1;

        //
        hashMap.put(key, value);

        hashMap.put(key, secondValue);

        //
        Assert.assertSame(secondValue, hashMap.get(key));
        Assert.assertTrue(hashMap.size() == 1);
    }

    @Test
    public void testClearRemovesAll() {
        //
        int value = 1;
        String key = "test";
        int secondValue = 1;

        //
        hashMap.put(key, value);
        hashMap.put(key, secondValue);
        hashMap.clear();

        //
        Assert.assertSame(null, hashMap.get(key));
        Assert.assertTrue(hashMap.isEmpty());
    }

    @Test
    public void testNullValueCanBeUsedAsKey() {
        //
        int expected = 1;

        //
        hashMap.put(null, expected);

        //
        Assert.assertSame(expected, hashMap.get(null));
    }
}
