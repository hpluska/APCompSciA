public class Assignment {
    private String name;
    private int totalPoints;
    private int dueDate;
    public Assignment(String n, int tp, int dd){
        name = n;
        totalPoints = tp;
        dueDate = dd;
    }

    public String getFormattedDueDate(){
        int temp = dueDate;
        int year = temp%100;
        temp /= 100;
        int month = temp%100;
        temp /= 100;
        int day = temp;
        return month + "/" + day + "/" + year;
    }

    public int getTotalPoints(){
        return totalPoints;
    }

    public String getAssignment(){
        return name;
    }

    public String toString(){
        String result = name + " is worth " + totalPoints + " points ";
        result += "and is due" + " on " + getFormattedDueDate();
        return result;
    }
}
