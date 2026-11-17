public class sort1{
    public static void main(String args[]){
        int a = 5, b = 6, c = 2; 

        if(Math.min(a, b)==b && Math.min(b, c) == b){
            int temp = a;
            a = b;
            b = temp;
        }
        if(Math.min(a, c) == c && Math.min(b, c) ==c){
            int temp = a;
            a = c;
            c = temp;
        }
        if(Math.min(b,c)==c){
            int temp = b;
            b = c;
            c = temp;
        }
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}