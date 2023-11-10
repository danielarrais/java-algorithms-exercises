package codingfriends;

// https://www.hackerrank.com/challenges/coding-friends/
class CodingFriends {

    public static void main(String[] args) {
        System.out.println(minNum(5, 3, 6));;
    }

    public static int minNum(int samDaily, int kellyDaily, int difference) {
        if (kellyDaily == samDaily) return -1;

        int samSolved = difference + samDaily;
        int kellySolved = kellyDaily;
        int days = 1;

        while (kellySolved - samSolved <= 0) {
            samSolved = samSolved + samDaily;
            kellySolved = kellySolved + kellyDaily;
            days++;
        }

        return days;
    }

}