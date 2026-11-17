public class p5 {

    public static void puf(int n) {
        if (n == 1) {
            System.out.print("x");
        } else if (n % 2 == 0) // n is even
        {
            System.out.print("{");
            puf(n - 1);
            System.out.print("}");
        } else // n is odd
        {
            System.out.print("<");
            puf(n - 1);
            System.out.print(">");
        }
    }

    public static void main(String args[]) {
        puf(5);
    }
}
