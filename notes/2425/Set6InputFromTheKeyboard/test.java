import java.io.*;
import java.util.*;

public class test{
    public static void main(String args[]){
    Scanner kbReader = new Scanner(System.in);
    System.out.println("How old are you?");
    int age = kbReader.nextInt();
    kbReader.nextLine();
    System.out.println("What is the name of this class?");
    String firstWord = kbReader.nextLine();
    System.out.println(firstWord);
    }

 }      