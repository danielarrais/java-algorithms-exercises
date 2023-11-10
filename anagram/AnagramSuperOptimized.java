package anagram;

// https://leetcode.com/problems/valid-anagram
public class AnagramSuperOptimized {

    public static void main(String[] args) {
        String one = "listen";
        String two = "netsil";

        System.out.println(isAnagram(one, two));
    }

    public static boolean isAnagram(String s, String t) {
        if (s == null || t == null) return false;
        if (s.length() != t.length()) return false;

        // Tamanho do alfabeto, se for considerar acentos, etc, use um hash map
        int[] occurrencesS = new int[26];

        for (char c:s.toCharArray()) {
            occurrencesS[c - 'a']++;
        }

        for (char c:t.toCharArray()) {
            occurrencesS[c - 'a']--;
        }

        for (int i : occurrencesS) {
            if (i != 0) return false;
        }

        return true;
    }
}