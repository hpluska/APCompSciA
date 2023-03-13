import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main{
    public static void main(String args[]){

        // //for(int num = 1234; num >=0; num = num/10){
        // //    System.out.print(num%10);
        // //
    
        // Scanner sc = new Scanner(System.in);

        // //System.out.println("How old are you?");
        // //unchecked
        // int age = sc.nextInt();
        // //System.out.println("You are " + age + " years old.");
        // //unchecked
   

        // try{
        // int div = 100/age;
        // System.out.println("100 divided by your age is " + div);
        // }catch(ArithmeticException e){
        //     System.out.println("cannot divide by zero");
        // }
        
        int[] arr = {0, 1, 2, 3, 4};

        // //unchecked
        try{
            System.out.println(10/0);
        }catch(ArithmeticException | NullPointerException e){
            e.getStackTrace();  
        }
            
        
        

        //checked
        // File f = new File("file.txt");
        // //try {
        //     try {
        //         Scanner fileScan = new Scanner(f);
        //     } catch (ArithmeticException e) {
        //         // TODO Auto-generated catch block
        //         System.out.println("file not found");
        //     }
        // // } catch (FileNotFoundException e) {
        // //     System.out.println("file not found");

        // // }
        

   
       
        

        
    }
}