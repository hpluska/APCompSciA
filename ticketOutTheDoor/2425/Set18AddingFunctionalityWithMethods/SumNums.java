public class SumNums{

    private int num1, num2, sum;

    public SumNums(int a, int b) {

        num1 = a;
        num2 = b;
    }

    public String getSum() {

        sum = num1 + num2;

        if (sum >= 18)
            return "I'm an adult!";

        return "Not old enough!";
    }
}