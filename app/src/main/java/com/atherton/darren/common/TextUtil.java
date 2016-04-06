package com.atherton.darren.common;

public class TextUtil {

    public static final String EMPTY_STRING = "";

    public static boolean isEmptyOrNull(String text) {
        return text == null || text.isEmpty();
    }
}
