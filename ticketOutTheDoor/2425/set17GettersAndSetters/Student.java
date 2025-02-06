public class Student{

    private String name;
    private int gradeLevel;
    private double GPA;
    private boolean hasScholarship;
    
    public Student( String n, int g, double gpa){
        name = n;
        gradeLevel = g;
        GPA = gpa;
        hasScholarship = false; 
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;    
    }
}