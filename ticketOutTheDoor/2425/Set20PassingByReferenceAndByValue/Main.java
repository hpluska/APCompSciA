public class Main {
    public static void main(String args[]){
        int y = 19;
        double b[] = new double[3];
        b[2] = 19;
        BankAccount ba = new BankAccount(10.0);
        method1(y, b, ba);
        System.out.println(y + " " + b[2] + " " + ba.balance);
    }

    public static void method1(int x, double a[], BankAccount theAccount){
        x = 332;
        a[2] = 54;
        theAccount.balance = 702;
    }
}
