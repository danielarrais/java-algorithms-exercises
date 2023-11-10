package twosum;

import java.util.Arrays;

// https://leetcode.com/problems/two-sum/
public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 5, 5, 11}, 10)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] combination = new int[]{0, 0};
        int lastValidSum = -1;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                boolean isCompatible = sum == target;

                if (isCompatible) {
                   return new int[]{i, j};
                }
            }
        }

        return combination;
    }
}
