public class test{

	public static void main(String houses[]){

		String s = "Hello againnx", sp[];
		sp = s.split("n");
System.out.println(sp.length);
System.out.println(sp[0]);
System.out.println(sp[1]);
System.out.println(sp[2]);

System.out.println("The number of n's is: " + (sp.length - 1));





		// System.out.println(houses[0]);
		// System.out.println(houses[1]);
		// System.out.println(houses[2]);
		// System.out.println(houses[3]);
		// System.out.println(houses[4]);




		//System.out.println("house2[0] " + houses2[0]);
		//System.out.println("house2[1] " + houses2[1]);

		/*
		String sss = "Some ssStrings";
		String[] sssArray = sss.split("s");
		System.out.println("sssLength = " + sssArray.length);
		System.out.println(sssArray[0]);
		System.out.println(sssArray[1]);
		System.out.println(sssArray[2]);


		String people = "Bart~Kyle,Bugs-Marvin";
		String houses[] = people.split("~|,|-");

		System.out.println(houses[0]);//prints Bart
		System.out.println(houses[1]);//prints Kyle
		System.out.println(houses[2]);//prints Bugs
		System.out.println(houses[3]);//prints Marvin

            String s = "ENOUGH USE OF THE WORD THE" + "DUMMY";
            String sp[] = s.split("THE");
            System.out.println(sp.length-1);//prints 1
	    System.out.println(sp[0]);
            System.out.println(sp[1]);
	    System.out.println(sp[2]);



	String[] assignments = {"assignment 1", "assignment 2", "assignment 3"};
	char[] Bart = {'5','R','3'};
	char[] Kyle = {'2','3','2'};	
	char[] Bugs = {'4','M','3'};
	char[] Marvin = {'5','2','3'};
	char score = '3';
	int index = 0;

	for(int a = 0; a < assignments.length; a++){
		if(assignments[a].equals("assignment 2")){

			index = a;

		}

	}
	Bugs[index] = score;
	System.out.println("Bugs now has a score of " + Bugs[index] + " on " + assignments[index]);
	


	//class average on assignment 3
	double avg = 0;
	for(int a = 0; a < assignments.length; a++){
		if(assignments[a].equals("assignment 3")){

			avg = (Bart[a] + Kyle[a] + Bugs[a] + Marvin[a])/4.0;

		}

	}
	System.out.println("The class average on assignment 3 is " + (avg-48));
	

	String s2 = "Hello Again", sp2[], sp3[];
	sp2 = s2.split("n");
	sp3 = s2.split("H");
	System.out.println(sp2.length);
	System.out.println(sp3.length);
*/
	}

}
