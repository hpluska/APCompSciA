public class p2 {
    public static int adrml(int n) {
        if (n <= 1)
            return n;
        else
            return n * adrml(n - 2);
    }

    public static void main(String args[]) {
        System.out.println(adrml(6));
    }
}
