public class code{
	public static void main(String args[]){


	int num = 1234;
	while(num > 0){

		System.out.print(num%10);
		num /= 10;
	}


	/*
	int j = 25;
		do{

     			System.out.println("Temp var = "+j);
     			j++;

		}while(j >=25 || j<=30);

	
	*/

	int i = 5, j2 = 0;
	do{

     		for(j2 = 0; j2 < i; j2++){
          	System.out.print("*");
     	}
     	System.out.println();
     	i--;

	}while(i > 0);
	}

}
