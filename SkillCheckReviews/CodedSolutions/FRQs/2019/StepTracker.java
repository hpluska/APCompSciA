public class StepTracker {
    private int minSteps;
    private int dailySteps;
    private int activeDays;
    private int days;
    private int totalSteps;

    public StepTracker(int s){
        minSteps = s;
        dailySteps = 0;
        activeDays = 0;
        days = 0;
        totalSteps = 0;
    }

    public void addDailySteps(int s){
        dailySteps += s;
        days++;
        if(dailySteps > minSteps){
            activeDays++;
        }
        totalSteps += dailySteps;
        dailySteps = 0;
        
    }

    public double averageSteps(){
        return totalSteps/days;
    }

    public int activeDays(){
        return activeDays;
    }
}
