import java.time.YearMonth;

public class Student{

    private String name;
    private int gradeLevel;
    private double GPA;
    private boolean hasScholarship;
    
    public Student(){     }
    
    public void setName(String n){
         name = n;
    }
    
    public void setGradeLevel(int g){
         gradeLevel = g;
    }
    
    public void setGPA(double gpa){
         GPA = gpa;
    }
    
    public void setHasScholarship(boolean s){
         hasScholarship = s;
    }
    
    public String getName(){
         return name;
    }
    
    public int getGradeLevel(){
         return gradeLevel;
    }
    public double getGPA(){
         return GPA;
    }
    public boolean getHasScholarship(){
         return hasScholarship;
    }
    public int getGradYear(){
         int gradYear = 0;
         int year = YearMonth.now().getYear();
         int month = YearMonth.now().getMonthValue();
         if(month>=6){
              gradYear = 12 - gradeLevel + year - 1;
         }else{
              gradYear = 12 - gradeLevel + year;
         }
         return gradYear;
    } 
}
