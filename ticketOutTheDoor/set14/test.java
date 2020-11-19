import java.io.*;
import java.util.*;

public class test{

	public static void main(String ars[]){
	/*
	String s = "\t\tLucky hocky puck\t\t";
	String m = "uck";
	String n = "puck";
	int j = 6, z = 99;


	System.out.println("Skill 14.1 Exercise 1 Part 1");
	int k1 = s.indexOf(m);
	System.out.println(k1);

	System.out.println("Skill 14.1 Exercise 1 Part 2");
	int k2 = s.indexOf('c');
	System.out.println(k2);

	System.out.println("Skill 14.1 Exercise 1 Part 3");
	char p1 = s.charAt(7);
	System.out.println(p1);

	System.out.println("Skill 14.1 Exercise 1 Part 4");
	int k3 = s.indexOf(z);
	System.out.println(k3);

	System.out.println("Skill 14.1 Exercise 1 Part 5");
	int k4 = s.indexOf('y', j);
	System.out.println(k4);

	System.out.println("Skill 14.1 Exercise 1 Part 6");
	char p2 = s.charAt(z-90);
	System.out.println(p2);

	System.out.println("Skill 14.1 Exercise 1 Part 7");
	int k5 = s.indexOf(m, 15);
	System.out.println(k5);

	System.out.println("Skill 14.1 Exercise 1 Part 8");
	int k6 = s.indexOf(z + 2, 4);
	System.out.println(k6);

	System.out.println("Skill 14.1 Exercise 1 Part 9");
	boolean k7 = s.contains(m);
	System.out.println(k7);

	System.out.println("Skill 14.1 Exercise 1 Part 10");
	String str = s.trim();
	System.out.println("+"+str+"+");

	System.out.println("Skill 14.1 Exercise 1 Part 11");
	System.out.println(m.compareTo(n));



	System.out.println(m.compareTo(n));

	System.out.println((int)s.charAt(0));
	System.out.println((int)m.charAt(0));

	String s1 = "dog";
	String s2 = "car";
	String s3 = "cat";
	String temp = "";
	//check if s1 is last
	if(s1.compareTo(s2)>0 && s1.compareTo(s3)>0){
		temp = s3;
		s3 = s1;
		s1 = temp;
	}

	//check if s2 is last
	if(s2.compareTo(s1)>0 && s2.compareTo(s3)>0){
		temp = s3;
		s3 = s2;
		s2 = temp;
	}
	//compare s1 and s2
	if(s1.compareTo(s2)>0){
		temp = s2;
		s2 = s1;
		s1 = temp;
	}
	System.out.println(s1 + " " + s2 + " " + s3);

*/
	String message = "a a a a";
	Scanner sc = new Scanner(message);
	int words = 0, letters=0, a = 0, b = 0, c = 0;

	while(sc.hasNext()){
		words++;
		String thisWord = sc.next();
		while(letters < thisWord.length()){
			
			if(thisWord.charAt(letters)==97)
				a++;
			if(thisWord.charAt(letters)==98)
				b++;
			if(thisWord.charAt(letters)==99)
				c++;

			letters++;
		}
		letters = 0;
		System.out.println();
	}
	System.out.println(a + ":" + b + ":" + c);
	
	} 
}
