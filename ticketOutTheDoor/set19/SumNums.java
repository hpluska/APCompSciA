public class SumNums {

    private int num1, num2, sum;

    public SumNums(int a, int b) {

        num1 = a;
        num2 = b;
    }

    public int getSum() {

        return num1 + num2;

    }

    public int getNum1() {

        return num1;

    }

    public int getNum2() {

        return num2;

    }

    public void setNum1(int a) {

        num1 = a;
    }

    public void setNum2(int b) {

        num2 = b;
    }
}