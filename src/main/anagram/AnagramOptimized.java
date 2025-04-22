package src.main.anagram;

import java.util.Arrays;

// https://leetcode.com/problems/valid-anagram
public class AnagramOptimized{

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
        int[] occurrencesT = new int[26];

        for (int i = 0; i < s.length(); i++) {
            occurrencesS[s.charAt(i) - 'a']++;
            occurrencesT[t.charAt(i) - 'a']++;
        }

        return Arrays.equals(occurrencesS, occurrencesT);
    }
}