package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String[] strArray = str.split("");
        strArray[0] = strArray[0].toUpperCase();
        String answer = "";
        for (String s : strArray) {
            answer += s;
        }
        return answer;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {

        String[] strArray = str.split("");
        String answer = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            answer += strArray[i];
        }
        return answer;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String reversed = reverse(str);
        String camelCased = camelCase(reversed);
        return camelCased;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        String[] strArray = str.split("");
        String answer = "";
        for (int i = 1; i < strArray.length - 1; i++) {
            answer += strArray[i];
        }
        return answer;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);

    }
}
