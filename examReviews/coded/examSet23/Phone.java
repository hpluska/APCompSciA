package examSet23;

public class Phone{

    private int areaCode;
    private int prefix;
    private int lineNumber;

    public Phone(int ac, int p, int ln){
        //below reads as "if ac greater than 0 and less than 100, assign
        //ac to areaCode, else assign 555"
        areaCode = ((ac > 0 && ac < 1000) ? ac : 555);
        //below reads as "if p greater than 0 and less than 1000, assign
        //p to prefix, else assign 555"
        prefix = ((p > 0 && p < 1000) ? p : 555);
        //below reads as "if ln greater than 0 and less than 1000, assign
        //ln to lineNumber, else assign 5555"
        lineNumber = ((ln > 0 && ln < 10000) ? ln : 5555);
    }

    public String makeCall(Phone p){
        return "Dialing " + p.toString();
    }

    public String toString(){

        return "" + areaCode + " " + " - " + prefix + " - " + lineNumber;

    }
    
}