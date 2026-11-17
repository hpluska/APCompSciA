import java.util.Arrays;
import java.util.Scanner;

public class Gradebook{

    public static void main(String args[]){
        //Creates a gradebook with 10 assignments
        Assignment gradebook[] = new Assignment[5];
        gradebook[0] = new Assignment("Exam 1", 18, 90123);
        gradebook[1] = new Assignment("Exam 2", 12, 90823);
        gradebook[2] = new Assignment("Exam 3", 17, 91523);
        gradebook[3] = new Assignment("Lab 2", 20, 91523);
        gradebook[4] = new Assignment("Ticket Out the Door 4", 5, 90223);

        //Prompts the user for the assignment information
        // Scanner input = new Scanner(System.in);
        // System.out.println("What is the name of the assignment?");
        // String name = input.nextLine();
        // System.out.println("How many points is the assignment out of?");
        // int points = input.nextInt();
        // System.out.println("What is the due date (mm/dd/yy)?");
        // String dueDate = input.next();

        // String dueDateArr[] = dueDate.split("/");
        // int dueDateFormatted = Integer.parseInt(dueDateArr[0] + dueDateArr[1] + dueDateArr[2]);
        // Assignment a = new Assignment(name, points, dueDateFormatted);

        // int high = gradebook[0].getTotalPoints();
        // int highIndex = 0;
        // for(int i = 1; i < gradebook.length;i++){
        //     if(gradebook[i].getTotalPoints() > high){
        //         high = gradebook[i].getTotalPoints();
        //         highIndex = i;
        //     }
        // }
        // System.out.println(gradebook[highIndex]);


        int Bart[] = {15, 9, 14, 20, 2};
        int Homer[] = {14, 11, 12, 28, 4};
        int Wilma[] = {12, 12, 9, 17, 5};
        int avgGrades[] = new int[5];
        int finalGrades[] = new int[3];
        double totalEarned = 0;
        double totalPoints = 0;
        
        for(int i = 0; i < avgGrades.length;i++){
            avgGrades[i] = (int)(((Bart[i] + Homer[i] + Wilma[i])/3.0)/gradebook[i].getTotalPoints()*100);
        }

         System.out.println(Arrays.toString(avgGrades));

    //    //Calculates Bart's grade 
        for(int i = 0; i < Bart.length;i++){

            System.out.println(gradebook[i].getAssignment() + ":\t" + Bart[i] + 
            "/" + gradebook[i].getTotalPoints());

            totalEarned += Bart[i];
            totalPoints += gradebook[i].getTotalPoints();
            //finalGrades[0] = (int)((double)totalEarned/(double)totalPoints * 100);
            
        }
         System.out.println("Final Grade: " + (int)((double)totalEarned/(double)totalPoints * 100));
    //     //Calculates Homer's grade
    //     totalEarned = 0;
    //     totalPoints = 0;
    //     for(int i = 0; i < Homer.length;i++){
    //         totalEarned += Homer[i];
    //         totalPoints += gradebook[i].getTotalPoints();
    //         finalGrades[1] = (int)((double)totalEarned/(double)totalPoints * 100);

    //     }
    //     //Calculates Wilma's grade
    //     totalEarned = 0;
    //     totalPoints = 0;
    //     for(int i = 0; i < Wilma.length;i++){
    //         totalEarned += Wilma[i];
    //         totalPoints += gradebook[i].getTotalPoints();
    //         finalGrades[2] = (int)((double)totalEarned/(double)totalPoints * 100);

    //     }
    //     // System.out.println(Arrays.toString(finalGrades));
        
    }

}
