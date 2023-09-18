public class test{
    public static void main(String args[]){
        int x = 10; 
        int y = 7; 
        System.out.println(y/x); 

        int x1 = 10; 
        int y1 = 7; 
        System.out.println(x1/y1);

        double x2 = 10; 
        int y2 = 7; 
        System.out.println(y2/x2);

        int x3 = 10; 
        int y3 = 3; 
        double z3 = x3/y3; 
        System.out.println(z3);

        int x4 = 10; 
        int y4 = 3; 
        System.out.println((double)x4/y4);

        int x5 = 10; 
        int y5 = 3; 
        System.out.println((double)x5%y5);

        double x6 = 10.5;
        int y6 = 3; 
        System.out.println(x6%y6); 

        double x7 = 10; 
        double y7 = 3; 
        double z7 = 10/3; 
        //int i7 = z7; 
        System.out.println("error");

        int p = 3; 
        double d = 10.3; 
        int j = (int)5.9; 
        System.out.println(p + p * (int)d - 3 * j);
    }
}