public class examSets15thru16{

    public static void main(String args[]){
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
                System.out.println(index);
            }
            
        }
        int aScores[] = {Bart[index], Kyle[index], Bugs[index], Marvin[index]};

        for(int s = 0; s < aScores.length; s++){
            if(aScores[s] > highScore){
                highScore = aScores[s];
                highStudent = students[s];
            }
            
        }
        System.out.println("The student with the highest score is " + highStudent + ", who scored a " + highScore);

    }


}