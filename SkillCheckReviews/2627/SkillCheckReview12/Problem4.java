import java.util.Scanner;

public class Problem4{

    public static void main(String args[]){
        String text = "ABACAAABAAACABA";
        String delimiter = "ACA";
        String result = "";
        int count = 0;
        Scanner sc = new Scanner(text);
        sc.useDelimiter(delimiter);
        while(sc.hasNext()){
            result += sc.next();
            count++;

        }
        System.out.println(count-1);
        System.out.println(result);
    }
}