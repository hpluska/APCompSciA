import java.io.*;
import java.util.*;

public class examSet14{

	public static void main(String args[]){

	String s = “Get here Thanksgiving!”;
	String m = “er”;
	int j = 8, z = 99;






	
	System.out.println("Type a message to encrypt: ");
	
	Scanner s = new Scanner(System.in);
	String scan = s.nextLine();
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
