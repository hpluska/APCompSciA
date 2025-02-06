public class SumNumsDriver {

    public static void main(String args[]) {

        SumNums s1 = new SumNums();// Prints Nothing to sum
        SumNums s2 = new SumNums(1, 2);// Prints 3
        SumNums s3 = new SumNums(1, 2, 3);// Prints 6
        SumNums s4 = new SumNums(1.0, 2.0);// Prints 3.0
    }
}