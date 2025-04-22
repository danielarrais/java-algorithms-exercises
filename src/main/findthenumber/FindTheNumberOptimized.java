package src.main.findthenumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// https://leetcode.com/problems/two-sum/
public class FindTheNumberOptimized {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 1000000; i++) {
            numbers.add(random.nextInt(1000000) + 1); // Gera um número aleatório entre 1 e 1000000 e adiciona à lista
        }

        // get the start time
        long start = System.nanoTime();

        findNumber(numbers, -2);

        // get the end time
        long end = System.nanoTime();

        // execution time
        long execution = end - start;
        System.out.println("Execution time: " + execution + " nanoseconds");
    }

    public static String findNumber(List<Integer> arr, int k) {
        if (arr == null || arr.isEmpty()) {
            return "NO";
        }

        int size = arr.size();
        int left = 0;
        int right = size - 1;

        while (left < right) {
            if (arr.get(left) == k || arr.get(right) == k) {
                return "YES";
            }

            left++;
            right--;
        }

        return "NO";
    }
}
