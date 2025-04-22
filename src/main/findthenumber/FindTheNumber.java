package src.main.findthenumber;

import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/two-sum/
public abstract class FindTheNumber implements Runnable{
    public static void main(String[] args) {

        // get the start time
        long start = System.nanoTime();

        List<Integer> number = Arrays.asList(-1, 3, -2, 4, 7);
        findNumber(number, -2);

        // get the end time
        long end = System.nanoTime();

        // execution time
        long execution = end - start;
        System.out.println("Execution time: " + execution + " nanoseconds");
    }

    public void TESTE() {
        new Thread(this, "DSASD");
    }

    public static String findNumber(List<Integer> arr, int k) {
        if (arr == null || arr.isEmpty()) {
            return "NO";
        }

        for (int n : arr) {
            if (n == k) {
                return "YES";
            }
        }

        return "NO";
    }

    @Override
    public void run() {

    }
}
