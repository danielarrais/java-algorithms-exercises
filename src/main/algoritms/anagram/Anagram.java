package src.main.algoritms.anagram;

import java.util.Arrays;

// https://leetcode.com/problems/valid-anagram
public class Anagram {

    public static void main(String[] args) {
        String one = "listen";
        String two = "netsil";

        System.out.println(isAnagram(one, two));
    }

    public static boolean isAnagram(String s, String t) {
        if (s == null || t == null) return false;
        if (s.length() != t.length()) return false;

        String[] sortedS = s.split("");
        String[] sortedT = t.split("");

        Arrays.sort(sortedS);
        Arrays.sort(sortedT);

        return Arrays.equals(sortedS, sortedT);
    }
}