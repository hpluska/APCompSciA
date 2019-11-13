import java.io.*;
import java.util.*;

public class examSet14{

	public static void main(String args[]){

	String msg = "Get off the couch!";

	Scanner s = new Scanner(msg);
	String encrypted = "";
	
		while(s.hasNext()){
			String word = s.next();
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
