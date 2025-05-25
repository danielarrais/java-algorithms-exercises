package src.main.algoritms.reversestring;

import src.main.algoritms.utils.TimerUtil;

/**
 * 344. Reverse String
 * <br/>
 * https://leetcode.com/problems/reverse-string/description/
 */
public class ReverseEachStringTwo {
    public static void main(String[] args) {
        testReverse("hello world", "olleh dlrow");
        testReverse("Java is cool", "avaJ si looc");
        testReverse("a b c", "a b c");
        testReverse("", "");
        testReverse("word", "drow");
        testReverse("hello  world", "olleh  dlrow");

        var testTime = "Hannah Hannah Hannah Hannah Hannah Hannah Hannah Hannah Hannah Hannah Hannah Hannah Hannah Hannah Hannah Hannah Hannah Hannah Hannah Hannah Hannah Hannah Hannah Hannah Hannah Hannah Hannah Hannah Hannah Hannah Hannah Hannah Hannah Hannah";
        TimerUtil.measureExecutionTime(() -> {
            reverseEachString(testTime);
        });
    }

    private static void testReverse(String input, String expected) {
        var result = reverseEachString(input);
        var passed = result.equals(expected);

        System.out.printf(
                "Input: %s | Expected: %s | Result: %s | %s%n",
                input,
                expected,
                result,
                passed ? "✅ PASSED" : "❌ FAILED");
    }

    public static String reverseEachString(String phrase) {
        if (phrase == null || phrase.isEmpty()) return phrase;

        var words = phrase.split(" ");

        for (int i = 0; i < words.length; i++) {
            words[i] = reverseString(words[i]);
        }

        return String.join(" ", words);
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
