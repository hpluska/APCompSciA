import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main throws FileNotFoundException{
    public static void main(String args[]){
        //Error - bad code!
        // for(int num = 1234; num >=0; num = num/10){
        //     System.out.print(num%10);
        // }
        

       
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a number");
        int n = sc.nextInt();
        int result = 500/n;

        //unchecked
            try{
              int age = sc.nextInt();
              System.out.println("You are " + age + " years old.");
            }catch(InputMismatchException e){
                System.out.println("Bad input");
            }
      
        
        //System.out.println(age/0);
        // /oi/unchecked
   

        // try{
        // int div = 100/age;
        // System.out.println("100 divided by your age is " + div);
        // }catch(ArithmeticException e){
        //     System.out.println("cannot divide by zero");
        // }
        
        // int[] arr = {0, 1, 2, 3, 4};

        // // //unchecked
        // try{
        //     System.out.println(10/arr[(int)(Math.random()*arr.length)]);
        // }catch(ArithmeticException e){
        //     System.out.println("Cannot divide by zero"); 
        // }catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println("Out of bounds");
        // }
            

        // checked
        File f = new File("file.txt");
        try {
            Scanner s = new Scanner(f);
        } catch (FileNotFoundException e) {
            // e.printStackTrace();
            System.out.println("file not found");
        }
  
        // try {
        //         Scanner fileScan = new Scanner(f);
        //         while (fileScan.hasNextLine()) {
        //             System.out.println(fileScan.nextLine());
        //         }
        //         fileScan.close();
        // } catch (FileNotFoundException e) {
        //         System.out.println("file not found");
        // }
   
        
    }
   
}


