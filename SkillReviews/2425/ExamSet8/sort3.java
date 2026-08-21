public class sort3 {
        public static void main(String[] args) {
            int a = 5; 
            int b = 6; 
            int c = 2; 

            int temp = a;
            if(b < a && b < c){
                //b is first so swap with a
                a = b; 
                b = temp;
                System.out.println("a = " + a);
                System.out.println("b = " + b);
                System.out.println("c = " + c);
            }
            if(c < a && c < b){
                //c is first so swap with a
                a = c; 
                c = temp;
                System.out.println("a = " + a);
                System.out.println("b = " + b);
                System.out.println("c = " + c);
            }
            if(c < b){
                //swap b and c
                temp = b;
                b = c;
                c = temp;
                System.out.println("a = " + a);
                System.out.println("b = " + b);
                System.out.println("c = " + c);
            }
           
        }
}
