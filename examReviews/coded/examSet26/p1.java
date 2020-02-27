
public class p1 {

    public static void main(String args[]) {
        showMe(0);
    }

    public static void showMe(int arg) {
        if (arg < 10) {
            showMe(arg + 1);
        } else {
            System.out.print(arg + " ");
        }
    }
}
