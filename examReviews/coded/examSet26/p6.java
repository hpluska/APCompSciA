public class p6 {

    public static void main(String[] args) {
        System.out.println(pls(4));
    }

    public static int pls(int n) {
        if (n == 0)
            return 5;
        else if (n == 1)
            return 11;
        else
            return pls(n - 1) + 2 * pls(n - 2);
    }

}
