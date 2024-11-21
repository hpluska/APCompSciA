import java.util.Scanner;

public class Problem4{

    public static void main(String args[]){
        String text = "ABAAAAABAAAAABA";
        String delimiter = "ACA";
        String result = "";
        Scanner sc = new Scanner(text);
        sc.useDelimiter(delimiter);
        while(sc.hasNext()){
            result += sc.next();
        }
        System.out.println(result);
    }
}