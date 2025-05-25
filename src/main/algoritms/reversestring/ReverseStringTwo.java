package src.main.algoritms.reversestring;

import src.main.algoritms.utils.TimerUtil;

/**
 * 344. Reverse String
 * <br/>
 * https://leetcode.com/problems/reverse-string/description/
 */
public class ReverseStringTwo {
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

        char[] chars = s.toCharArray();
        int length = chars.length - 1;
        int maxInteractions = chars.length / 2;

        for (int i = length; i >= maxInteractions; i--) {
            char temp = chars[length - i];

            chars[length - i] = chars[i];
            chars[i] = temp;
        }

        return new String(chars);
    }
}
