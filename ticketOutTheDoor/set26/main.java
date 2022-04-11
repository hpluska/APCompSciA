import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main{
    public static void main(String args[]){

        //for(int num = 1234; num >=0; num = num/10){
        //    System.out.print(num%10);
        //
    
        Scanner sc = new Scanner(System.in);

        //System.out.println("How old are you?");
        //unchecked
        int age = sc.nextInt();
        //System.out.println("You are " + age + " years old.");
        //unchecked
   

        try{
        int div = 100/age;
        System.out.println("100 divided by your age is " + div);
        }catch(ArithmeticException e){
            System.out.println("cannot divide by zero");
        }
        
        

        //unchecked
        try{
        int[] arr = {0, 1, 2, 3, 4};
      
        System.out.println(arr[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("out of bounds");
        }
        
/*
        //checked
        File f = new File("file.txt");
        try {
            Scanner fileScan = new Scanner(f);
        } catch (FileNotFoundException e) {
            System.out.println("file not found");

        }
        */

   
       
        

        
    }
}