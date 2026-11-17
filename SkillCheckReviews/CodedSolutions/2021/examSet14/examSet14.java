import java.io.*;
import java.util.*;

public class examSet14{

	public static void main(String args[]){
	String p = "";
	String s = "Get here Thanksgiving!";
	String m = "er";
	int j = 8, z = 99;

	p = "1a";
	System.out.print(p + " : ");
	int k = s.indexOf(m);
	System.out.println(k);//5

	p = "1b";
	System.out.print(p + " : ");
	int k2 = s.indexOf('T');
	System.out.println(k2);//9

	p = "1c";
	System.out.print(p + " : ");
	char p2 = s.charAt(6);
	System.out.println(p2);//r

	p = "1d";
	System.out.print(p + " : ");
	int k3 = s.indexOf(z);
	System.out.println(k3);//-1

	p = "1e";
	System.out.print(p + " : ");
	int k4 = s.indexOf('g', j);
	System.out.println(k4);//15

	p = "1f";
	System.out.print(p + " : ");
	char p3 = s.charAt(z - 90);
	System.out.println(p3);//T

	p = "1g";
	System.out.print(p + " : ");
	int k5 = s.indexOf(m, 15);
	System.out.println(k5);//-1

	p = "1h";
	System.out.print(p + " : ");
	int k6 = s.indexOf(z + 2, 4);
	System.out.println(k6);//5

	p = "1i";
	System.out.print(p + " : ");
	boolean k7 = s.contains(m);
	System.out.println(k7);//true

	p = "1j";
	System.out.print(p + " : ");
	String s2 = "     JAVA      ";
	String k8 = "!" + s2.trim() + "!";
	System.out.println(k8); //!JAVA!

	p = "1k";
	System.out.print(p + " : ");
	System.out.println(m.compareTo(s));//30

	
	System.out.println("Type a message to encrypt: ");
	
	Scanner sc = new Scanner(System.in);
	String scan = sc.nextLine();
	Scanner msg = new Scanner(scan);

	String encrypted = "";
	
		while(msg.hasNext()){
			String word = msg.next();
			for(int l = 0; l < word.length();l++){
				if(word.charAt(l)=='c')
					encrypted += "c'mon";
				else if(word.charAt(l) == 'o')
					encrypted += "ouch!";
				else
					encrypted += word.charAt(l);
			}
		encrypted += " ";//adds space between words

		}
		System.out.println(encrypted);
	}
	



}
