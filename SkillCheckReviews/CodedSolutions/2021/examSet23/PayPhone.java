package examSet23;

public class PayPhone extends Phone {

    private double cost;
    protected double moneyInserted;
    public PayPhone(int ac, int p, int ln, double c){
        super(ac, p, ln);
        //below reads as "if c greater than 0, assign
        //c to cost, else assign 0"
        cost = ((c >= 0) ? c : 0);
    }

    public void insertMoney(double money){
        moneyInserted += money;
    }


    public String makeCall(Phone p){
        if(moneyInserted >= cost){
            moneyInserted -= cost;
            return super.makeCall(p);
        }
        return "Please insert more money to place a call";
    }
}