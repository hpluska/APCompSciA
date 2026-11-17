public class sort2 {
    public static void main(String args[]){
        int a = 5, b = 6, c = 2;
        // int a = 6, b = 2, c = 5;
        // int a = 2, b = 6, c = 5;

        if(a > b){
            int temp = a; 
            a = b; 
            b = temp;
        }
        if(a > c){
            int temp = a;
            a = c; 
            c = temp;
        }
        if(b > c){
            int temp = b;
            b = c;
            c = temp;
        }
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
