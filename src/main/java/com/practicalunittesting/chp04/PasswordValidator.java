package com.practicalunittesting.chp04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by m3c0d3 on 1/3/2018.
 */
public class PasswordValidator {
    public static boolean validate(String password) {
        if (password.length() < 5)
            return false;

        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(password);

        if (!m.find())
            return false;

        return true;
    }
}
