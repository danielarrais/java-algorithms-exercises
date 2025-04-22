package src.main.oddnumbers;

import java.util.ArrayList;
import java.util.List;

public class OddNumbers {
    public static void main(String[] args) {
        System.out.println(findNumber(1, 88));
    }

    public static List<Integer> findNumber(int l, int r) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (i % 2 != 0) numbers.add(i);
        }

        return numbers;
    }
}
