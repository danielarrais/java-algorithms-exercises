package src.main.firstmissingpositive;

public class SuperOptimizedFirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = new int[]{7,8,9,11,12};

        int n = arr.length;
        int r = 1;
        int[] freq = new int[n + 1];

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0 && arr[i] < n + 1) freq[arr[i]] = 1;
        }

        for (int i = 1; i < n + 1; i++) {
            if (freq[i] != 1) {
                System.out.println(r);
                break;
            }
            r++;
        }

        System.out.println(r);
    }
}
