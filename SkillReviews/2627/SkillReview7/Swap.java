public class Swap {
    public static void main(String args[]){
        int a = 5; 
        int b = 2;


        //solution 1
        int num1 = 5; 
        int num2 = 2;
        int max = (num1 > num2 ? num1 : num2);
        num1 = (num1 == max ? num2: num1);
        num2 = max;
        System.out.println("num1 : " + num1 + "num2: " + num2);

        //solution 2
        // int min = Math.min(num1, num2);
        // num2 = (num1 > num2 ? num1:num2);
        // num1 = min;
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

    }
}
