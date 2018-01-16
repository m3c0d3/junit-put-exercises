package com.practicalunittesting.chp03;

import java.util.ArrayList;
import java.util.List;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for exercises.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class StringUtils {

    public String reverse(String s) {
        List<String> reversedCharacters = getReversedCharacters(s);

        StringBuilder reversed = concatCharacters(reversedCharacters);

        return reversed.toString();
    }

    private StringBuilder concatCharacters(List<String> tempArray) {
        StringBuilder reversedString = new StringBuilder(tempArray.size());
        for (int i = tempArray.size() - 1; i >= 0; i--) {
            reversedString.append(tempArray.get(i));
        }
        return reversedString;
    }

    private List<String> getReversedCharacters(String s) {
        List<String> tempArray = new ArrayList<>(s.length());
        for (int i = 0; i < s.length(); i++) {
            tempArray.add(s.substring(i, i + 1));
        }
        return tempArray;
    }
}
