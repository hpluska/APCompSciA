import java.util.Scanner;

public class test {
    public static void main(String args[]) {

Scanner s = new Scanner(System.in);
System.out.println("Do you want to play a game (y)?");
String r = s.next();

while(r.equals("y")){

System.out.println("Do you want to play a game (y)?");
r = s.next();

}
    }
}
