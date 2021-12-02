package com.neha.gs.one;

public class ReverseStringOther {
    public static void main(String[] args) {
        System.out.println("dcba".equals(reverseStr("abcd")));
        //System.out.println("no change".equals(reverseStr("no change")));
        System.out.println("odd abcde".equals(reverseStr("edcba ddo")));
        System.out.println("even abcde".equals(reverseStr("edcba neve")));
        System.out.println("".equals(reverseStr("")));

    }

    public static String reverseStr(String str) {
        if (str.length() == 0) {
            return str;
        }
        int strLength = str.length();
        StringBuilder sb = new StringBuilder(strLength);
        for (int i = strLength - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}