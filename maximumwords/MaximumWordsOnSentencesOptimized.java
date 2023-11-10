package maximumwords;

// https://leetcode.com/problems/valid-anagram
public class MaximumWordsOnSentencesOptimized {
    public static void main(String[] args) {
        String[] sentences = new String[]{"please wait", "continue to fight", "continue to win"};

        long maxLength = 0;

        for (String sentence : sentences) {
            int spacesCount = 0;
            char[] chars = sentence.toCharArray();

            for (char c : chars) {
                if (c == ' ') spacesCount++;
            }

            if (spacesCount > maxLength) {
                maxLength = spacesCount;
            }
        }

        System.out.println("Words: " + (maxLength + 1));
    }
}