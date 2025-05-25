package src.main.algoritms.ispossible;

class IsPossible {

    public static void main(String[] args) {
        System.out.println(isPossibleMySolution(1, 4, 62, 45));
    }

    public static String isPossibleMySolution(int a, int b, int c, int d) {
        if (a < 1 || a > 1000) return "No";
        if (b < 1 || b > 1000) return "No";
        if (c < 1 || c > 1000) return "No";
        if (d < 1 || d > 1000) return "No";

        int[] ab = new int[]{a, b};
        int[] cd = new int[]{c, d};

        int count = 1;


        while (ab[1] < cd[1]) {
            if (count % 2 != 0 && ab[0] <= cd[0]) {
                ab[0] = ab[1] + ab[0];
            }

            if (count % 2 == 0 && ab[1] <= cd[1]) {
                ab[1] = ab[0] + ab[1];
            }

            if (isEqual(ab, cd)) return "Yes";

            count++;
        }

        return "No";
    }

    public static boolean isEqual(int[] ab, int[] cd) {
        return ab[1] == cd[1] && ab[0] == cd[0];
    }

}