package src.main.reversestring;

import src.main.utils.TimerUtil;

import java.util.Arrays;

/**
 * 344. Reverse String
 * <br/>
 * https://leetcode.com/problems/reverse-string/description/
 */
public class ReverseString {
    public static void main(String[] args) {
        testReverse("hello", "olleh");
        testReverse("Hannah", "hannaH");
        testReverse("a", "a");
        testReverse("", "");
        testReverse("1234", "4321");

        var testTime = "HannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannah";
        TimerUtil.measureExecutionTime(() -> {
            reverseString(testTime);
        });
    }

    private static void testReverse(String input, String expected) {
        var result = reverseString(input);
        var passed = result.equals(expected);

        System.out.printf(
                "Input: %s | Expected: %s | Result: %s | %s%n",
                input,
                expected,
                result,
                passed ? "✅ PASSED" : "❌ FAILED");
    }

    public static String reverseString(String s) {
        if (s.isEmpty()) return s;

        var newWord = new StringBuilder();
        int length = s.length() - 1;
        var chars = s.toCharArray();

        for (int i = length; i >= 0; i--) {
            newWord.append(chars[i]);
        }

        return newWord.toString();
    }
}
