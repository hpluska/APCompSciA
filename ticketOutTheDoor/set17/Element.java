public class Element{
    public String symbol;
    public double weight;
    public int atomicNumber;
    public boolean isMetal;

    public Element(String s, double w, int an, boolean isM){

        symbol = s;
        weight = w;
        atomicNumber = an;
        isMetal = isM;
        System.out.println("This is " + s);
    
    }

    private double getWeight(){
        return weight;
    }
}