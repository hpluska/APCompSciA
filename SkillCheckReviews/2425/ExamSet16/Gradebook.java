import java.util.Arrays;
import java.util.Scanner;

public class Gradebook{

    public static void main(String args[]){
        //Creates a gradebook with 10 assignments
        Assignment gradebook[] = new Assignment[5];
        gradebook[0] = new Assignment("Exam 1", 18, "09/01/23", true);
        gradebook[1] = new Assignment("Exam 2", 12, "09/08/23", true);
        gradebook[2] = new Assignment("Exam 3", 17, "09/15/23", true);
        gradebook[3] = new Assignment("Lab 2", 20, "09/15/23", false);
        gradebook[4] = new Assignment("Ticket Out the Door 4", 5, "09/02/23", true);


        //Assigment worth the most points
        int high = gradebook[0].totalPoints;
        int highIndex = 0;
        for(int i = 1; i < gradebook.length;i++){
            if(gradebook[i].totalPoints > high){
                high = gradebook[i].totalPoints;
                highIndex = i;
            }
        }
        String result = gradebook[highIndex].name + " is worth " + gradebook[highIndex].totalPoints + " points";
        System.out.println(result);

        //Average grades
        int Bart[] = {15, 9, 14, 20, 2};
        int Homer[] = {14, 11, 12, 28, 4};
        int Wilma[] = {12, 12, 9, 17, 5};
        int avgGrades[] = new int[gradebook.length];

        for(int i = 0; i < gradebook.length;i++){
            avgGrades[i] = (int)(((Bart[i] + Homer[i] + Wilma[i])/3.0)/gradebook[i].totalPoints*100);
        }

        System.out.println(Arrays.toString(avgGrades));

        //Calculates Bart's grade 
        String reportCard = "";
        double totalEarned = 0;
        double totalPoints = 0;
        for(int i = 0; i < Bart.length;i++){

            reportCard += gradebook[i].name + ":\t" + Bart[i] + 
             "/" + gradebook[i].totalPoints;
             
             if(!gradebook[i].countInGrade){
                reportCard += "*";
             }else{
                totalEarned += Bart[i];
                totalPoints += gradebook[i].totalPoints;
             }
             reportCard += "\n";

        }
        double finalGrade = Math.round(totalEarned/totalPoints * 100);
        reportCard += "Final Grade = " + finalGrade;
        System.out.println(reportCard);

        //  System.out.println("Final Grade: " + (int)((double)totalEarned/(double)totalPoints * 100));
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
