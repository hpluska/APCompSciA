public class headsInARow {

    public static int countFlips(int headsInARow, int count, int flips) {

        if (headsInARow == count) {
            return flips;
        }

        if (Math.random() < 0.5) {

            return countFlips(headsInARow, count + 1, flips + 1);
        } else {

            return countFlips(headsInARow, 0, flips + 1);
        }
    }

    public static void main(String args[]) {
        // System.out.println(reverseNumRecursion(1234, 3));
        // System.out.println(reverseNum(1234, 3));

        int headsInARow = 10; // Number of heads required in a row

        int flips = countFlips(headsInARow, 0, 0);
        System.out.println(flips);
        // System.out.println(decToBinRecur(8));
    }

}
