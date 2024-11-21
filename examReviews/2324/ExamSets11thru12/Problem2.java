public class Problem2 {
    public static void main(String args[]) {
        int m = 0;
        int j = 0;

        do {
            j *= -1;
            if (j >= 0) {
                m += 2;
            }
            j += 2;

        } while (m < 4);

        System.out.println(j);

        int i = 5, j2 = 0;
        do {

            for (j2 = 0; j2 < i; j2++) {
                System.out.print("*");
            }
            System.out.println();
            i--;

        } while (i > 0);

    }
}
