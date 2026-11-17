public class test {
    public static void main(String[] args) {
        for (int outer = 0; outer < 5; outer++) {

            System.out.println(outer);// outer is printed 5 times

            for (int inner = 0; inner < 8; inner++) {

                System.out.print(inner);// inner is printed 40 times

            } // end inner loop
        System.out.println();
        } // end outerloop
    }
}