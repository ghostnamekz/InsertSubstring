package com.epam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InsertSubstring {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(cat)");
        Matcher matcher = pattern.matcher("one cat, two cats, or three cats on a fence");
        StringBuffer sb = new StringBuffer();
        while (matcher.find())
            matcher.appendReplacement(sb, "$1erpillar");
        matcher.appendTail(sb);
        System.out.println(sb);
    }
}