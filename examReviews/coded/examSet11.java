import java.io.*;
import java.util.*;

public class examSet11{
	public static void main(String args[]){

	int numHeads = 1;
	int headsCount = 0;
	int flips = 0;

	while(headsCount < numHeads){
		int result = (int)(Math.random()*2);// 0 or 1

		if(result == 1){
			headsCount++;
		}else{
			headsCount = 0;
		}

		flips++;
	}
	System.out.println(flips);
	//number 4
	Scanner s = new Scanner(System.in);
	String msg = "", prompt = "", q = "";
	do{
	System.out.println("Ask me a yes/no question");
	q = s.nextLine();
	int result = (int)(Math.random()*2);

	switch(result){
		case 0:
			msg = "NO!";
			break;
		case 1:
			msg = "YES!";
			break;	
	}
	System.out.println(msg);
	System.out.println("Do you want to play again? (y)");
	prompt = s.nextLine();
	}while(prompt.equals("y"));


	//number 3
	int m = 0;
	int j = 0;

	do{
	j *= -1;
	     if(j >= 0){
		m += 2;
	     }
	j+=2;

	}while(m < 4);

	System.out.println("The value of j is: " + j);

	int i2 = 5, j2 = 0;
	do{

     		for(j2 = 0; j2 < i2; j2++){
          		System.out.print("*");
     		}
     	System.out.println();
     	i2--;

	}while(i2 > 0);


	

	}
}


