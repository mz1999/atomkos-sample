package com.apusic.samples.utils;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;

public class Utils {

    public static String randomAlphabeticString(int targetStringLength) {

        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return generatedString;
    }

    public static int getRandomNumberUsingNextInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    public static String exception2String(Throwable throwable) {

        StringWriter buf = new StringWriter();
        PrintWriter out = null;
        try {
            out = new PrintWriter(buf);
            throwable.printStackTrace(out);
        } finally {
            if (out != null) {
                out.close();
            }
        }
        return buf.getBuffer().toString();
    }
}
