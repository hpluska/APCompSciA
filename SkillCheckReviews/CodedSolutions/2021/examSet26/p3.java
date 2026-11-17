public class p3 {

    public static int rig(int n) {
        if (n == 0) {

            return 5;
        } else if (n == 1) {
            return 8;
        } else {
            return rig(n - 1) - rig(n - 2);
        }
    }

    public static void main(String args[]) {
        System.out.println(rig(4));
    }
}
