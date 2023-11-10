package maximumwords;

// https://leetcode.com/problems/valid-anagram
public class MaximumWordsOnSentences {
    public static void main(String[] args) {

        String[] sentences = new String[]{"please wait", "continue to fight", "continue to win"};

        int maxLength = 0;

        for (String sentence : sentences) {
            int length = sentence.split(" ").length;

            if (length > maxLength) {
                maxLength = length;
            }
        }

        System.out.println("Words: " + maxLength);
    }
}