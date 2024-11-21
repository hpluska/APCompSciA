public class Swap {
    public static void main(String args[]){
        // int a = 2; 
        // int b = 5;

        int num1 = 55;
        int num2 = 65;
        //solution 1
        // int max = (a > b ? a : b);
        // a = (a == max ? b: a);
        // b = max;
        //solution 2
        int min = Math.min(num1, num2);
        num2 = (num1 > num2 ? num1:num2);
        num1 = min;
        //Yuji Solution
        // int num1 = 5;
        // int num2 = 3;
        // int temp = num1;
        // num1 = num2 < num1 ? num2:num1;//3
        // num2 = num2 > num1 ? num2:temp;

        //max solution
        // int temp = num1;
        // int min = Math.min(num1, num2);
        // num1 = num2 == min ? num2: num1;
        // num2 = num1 == num2 ?temp:num2;

        // boolean swap = (num1 < num2 ? false:true);
        // int temp = num1;
        // num1 = (swap ? num2:num1);
        // num2 = (swap ? temp:num2);

     
        System.out.println(num1 + ":" + num2);
        // System.out.println(a + ":" + b);
    }
}
