import java.text.ParseException;

public class Driver {
    public static void main(String args[]){
        APCalendar c = new APCalendar();
        int n =  c.dayOfWeek(2, 22, 1985);
        System.out.println(n);

    }
    
}
