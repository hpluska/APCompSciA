public class test{
    public static void main(String args[]){
        String assignments[] = {"Exam 1","Exam 2","Exam 3","Lab 1","Lab 2","Lab 3","Project 1"};
        int Bart[] = {5,1,3,1,2,3,3};
        int Homer[] = {4,4,4,4,4,4,4};
        int Wilma[] = {4,5,2,5,3,4,4};
        int student[] = Bart;
        /* averages implementation not shown */
        int mode = 0;
        int count = 0;
        for(int i = 0; i < student.length; i++){
            int tempMode = student[i];
            int tempCount = 0;
            for(int j = 0; j < student.length; j++){
                if(student[i] == student[j]){
                    tempCount++;
                }
            }
            if(tempCount > count ){
                mode = tempMode;
                count = tempCount;
            }
            
        }
        System.out.println(mode + " Appears " + count + " times");

        double averages[] = new double[assignments.length];
        for(int i = 0; i < assignments.length;i++){
            double tempTotal = Bart[i] + Homer[i] + Wilma[i];
            int tempAverage = (int)(tempTotal/3*100);
            averages[i] = tempAverage/100.0;
            System.out.println(averages[i]);
        }
    }
}