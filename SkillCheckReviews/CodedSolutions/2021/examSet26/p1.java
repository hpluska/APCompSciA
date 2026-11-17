
public class p1 {

    public static void main(String args[]) {
        showMe(0);
    }

    public static void showMe(int arg) {
        if (arg < 10) {
            showMe(arg + 1);
        } else {
            // only 10 is printed because that is the
            // only argument that is not less than 10
            // if the else is removed, ALL the arguments are printed
            System.out.print(arg + " ");
        }

    }
}
