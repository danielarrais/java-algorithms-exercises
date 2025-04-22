package src.main.romantointerger;

/**
 * Roman to Integer
 * <br/>
 * https://leetcode.com/problems/roman-to-integer/description/
 */
class RomanToInteger {
    public static int convert(String s) {
        var lastNumber = 0;
        int sum = 0;
        char[] chars = s.toCharArray();
        int length = chars.length;

        for (int i = length - 1; i > -1; i--) {
            int value = getValue(chars[i]);

            if (value >= lastNumber) {
                sum += value;
            } else {
                sum -= value;
            }

            lastNumber = value;
        }

        return sum;
    }

    public static int getValue(char c) {
        switch(c) {
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
        }

        return 0;
    }
}