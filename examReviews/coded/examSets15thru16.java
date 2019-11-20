public class examSets15thru16{

    public static void main(String args[]){
	//Problem 2
	String houses[] = {null, "Wilma", "Barney", "Homer", null, "Bart"};
	int address = 0;
	for(int a = 0; a < houses.length; a++){

			if(houses[a]!=null&&houses[a].equals("Wirt")){
				address = a;
				break;
			}
			else{
				address = -1;
			}

	}
	System.out.println(address);
	
	//Problem 3
	String housesNew[] = new String[houses.length+2];
	for(int h = 0; h < houses.length; h++){
		housesNew[h] = houses[h];

	}

	//Problem 4
	String s = "Hello againnn", sp[];
	sp = s.split("a");
	System.out.println(sp[0]); 
	System.out.println(sp[1]); 
	System.out.println(sp[2]);

	sp = s.split("\\s"); 
	System.out.println(sp[0]); 
	System.out.println(sp[1]);

	sp = s.split("e|g"); 
	System.out.println(sp[0]); 
	System.out.println(sp[1]); 
	System.out.println(sp[2]);

	sp = s.split("n");
	System.out.println("length: " + (sp.length - 1));

	sp = s.split("H");
	System.out.println(sp.length - 1);


	//Problem 6
        int a = 5;
        String search = "assignment4";
        String assignments[] = {"assignment1", "assignment2", "assignment3", "assignment4", "assignment5"};
        char Bart[] = {5, 'R', 3, 4, 'M'};
        char Kyle[] = {2, 3, 2, 4, 'R'};
        char Bugs[] = {4, 'M', 3, 5, 4};
        char Marvin[] = {5, 2, 3, 3, 4};
        String students[] = {"Bart", "Kyle", "Bugs","Marvin"};
        
        int highScore = 0;
        String highStudent = students[0];
        int index = 0;

        for(int i = 0; i < assignments.length;i++){
            if(assignments[i].equals(search)){
                index = i;
                System.out.println("index of assignment = " + index);
            }
            
        }
        int aScores[] = {Bart[index], Kyle[index], Bugs[index], Marvin[index]};

        for(int stu = 0; stu < aScores.length; stu++){
            if(aScores[stu] > highScore){
                highScore = aScores[stu];
                highStudent = students[stu];
            }
            
        }
        System.out.println("The student with the highest score is " + highStudent + ", who scored a " + highScore);

    }
}


}
