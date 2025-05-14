package src.main.reversestring;

import src.main.utils.TimerUtil;

/**
 * 344. Reverse String
 * <br/>
 * https://leetcode.com/problems/reverse-string/description/
 */
public class ReverseEachString {
    public static void main(String[] args) {
        testReverse("hello world", "olleh dlrow");
        testReverse("Java is cool", "avaJ si looc");
        testReverse("a b c", "a b c");
        testReverse("", "");
        testReverse("   ", "   ");
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

        var words = phrase.toCharArray();
        var start = 0;

        for (int i = 0; i <= words.length; i++) {
            if (i == words.length || words[i] == ' ') {
                reverseChars(words, start, i - 1);
                start = i + 1;
            }
        }

        return new String(words);
    }

    public static void reverseChars(char[] chars, int left, int right) {
        if (chars.length == 0) return;

        while (left < right) {
            char temp = chars[left];

            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }
    }
}
