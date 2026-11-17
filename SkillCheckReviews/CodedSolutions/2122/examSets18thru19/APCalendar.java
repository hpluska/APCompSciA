import java.util.List;
import java.time.LocalDate;
import java.time.Month;
 

public class APCalendar {
    
/** 
 *  Returns true if year is a leap year and false otherwise. 
*/ 
public boolean isLeapYear(int year) 
{ 
    /* implementation not required */
    
    // if the year is divided by 4
    if (year % 4 == 0) {

        // if the year is century
        if (year % 100 == 0) {
  
          // if year is divided by 400
          // then it is a leap year
          if (year % 400 == 0)
            return true;
          else
            return false;
        }
        
        // if the year is not century
        else
          return true;
      }
      
      else
        return false; 
} 

/** 
 *  Returns the number of leap years between year1 and year2, inclusive. 
 *  Precondition: 0 <= year1 <= year2 
*/ 
public int numberOfLeapYears(int year1, int year2) 
{ 
    /* to be implemented in part (a) */ 
    int leapYearCount = 0;
    for(int y = year1; y <=year2; y++){
        if(isLeapYear(y)){
            leapYearCount++;
        }
    }
    return leapYearCount;
} 

/** 
 *  Returns the value representing the day of the week for the first 
 *  day of year, 
 *  where 0 denotes Sunday, 1 denotes Monday, ..., and 6 denotes Saturday. 
 * @throws ParseException
*/ 
public static int firstDayOfYear(int year)
{ 
    /* implementation not required */ 
    String daysOfWeek[] = {"SUNDAY","MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY","SATURDAY"};
    int dayWeek = 0;
    LocalDate localDate = LocalDate.of(year, Month.JANUARY, 01);
    String d = localDate.getDayOfWeek().toString();

    for(int i = 0; i < daysOfWeek.length; i++){
        if(d.equals(daysOfWeek[i]))
            dayWeek = i;
    }
    return dayWeek;
}

/** 
 *  Returns n, where month, day, and year specify the nth day of the year. 
 *  Returns 1 for January 1 (month = 1, day = 1) of any year. 
 *  Precondition: The date represented by month, day, year is a valid date. 
*/ 
public int dayOfYear(int month, int day, int year) 
{ 
    /* implementation not required */ 
    int dayYear = 0;
    LocalDate localDate = LocalDate.of(year, month, day);
    dayYear = localDate.getDayOfYear();
    return dayYear;
} 

/** 
 *  Returns the value representing the day of the week for the given date 
 *  (month, day, year), where 0 denotes Sunday, 1 denotes Monday, ..., 
 *  and 6 denotes Saturday. 
 *  Precondition: The date represented by month, day, year is a valid date. 
*/ 
public int dayOfWeek(int month, int day, int year) 
{ 
    /* to be implemented in part (b) */ 
    int dOfYear = dayOfYear(month, day, year);
    int fdOfYear = firstDayOfYear(year);
    return (dOfYear + fdOfYear - 1)%7;
} 

// There may be instance variables, constructors, and other methods not shown. 
}


