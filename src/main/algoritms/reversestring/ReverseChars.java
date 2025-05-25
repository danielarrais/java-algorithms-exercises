package src.main.algoritms.reversestring;

import src.main.algoritms.utils.TimerUtil;

import java.util.Arrays;

/**
 * 344. Reverse String
 * <br/>
 * https://leetcode.com/problems/reverse-string/description/
 */
public class ReverseChars {
    public static void main(String[] args) {
        testReverse("hello".toCharArray(), "olleh".toCharArray());
        testReverse("Hannah".toCharArray(), "hannaH".toCharArray());
        testReverse("ab".toCharArray(), "ba".toCharArray());
        testReverse("abab".toCharArray(), "baba".toCharArray());
        testReverse("a".toCharArray(), "a".toCharArray());
        testReverse("".toCharArray(), "".toCharArray());
        testReverse("HannahHannaçHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannah".toCharArray(), "4321".toCharArray());

        var testTime = "HannahHannaçHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannahHannah".toCharArray();
        TimerUtil.measureExecutionTime(() -> {
            reverseChars(testTime);
        });
    }

    private static void testReverse(char[] input, char[] expected) {
        char[] result = reverseChars(Arrays.copyOf(input, input.length));
        boolean passed = Arrays.equals(result, expected);

        System.out.printf("Input: %s | Expected: %s | Result: %s | %s%n",
                Arrays.toString(input),
                Arrays.toString(expected),
                Arrays.toString(result),
                passed ? "✅ PASSED" : "❌ FAILED");
    }

    public static char[] reverseChars(char[] s) {
        if (s.length == 0) return s;

        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[right];

            s[right] = s[left];
            s[left] = temp;

            left++;
            right--;
        }

        return s;
    }
}
