package src.main.algoritms.firstmissingpositive;

public class CycleFirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = new int[]{-5};

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] >= 1 && nums[i] <= n && nums[i] != i + 1) {
                if (nums[nums[i] - 1] == nums[i])
                    continue;
                int temp = nums[i];
                nums[i] = nums[nums[i] - 1];
                nums[temp - 1] = temp;
                i--;
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                System.out.println(i + 1);
                break;
            }
        }

    }
}
