package src.main.removeduplicateditens;

import java.util.Arrays;

public class RemoveDuplicatedItems {
    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};

        int uniquesCount = 0;

        for (int j = 0; j < nums.length; j++) {
            if (j == 0 || nums[j] != nums[j-1]) {
                nums[uniquesCount] = nums[j];
                uniquesCount++;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
