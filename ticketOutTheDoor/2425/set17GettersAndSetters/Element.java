public class Element{

    private String symbol;
    private double atomicMass;
    private int atomicNumber;
    private boolean isMetal;

     public Element(String s, double m, int n){
        symbol = s;
        atomicMass = m;
        atomicNumber = n;
        isMetal = false;
     }

     public String getSymbol(){

        return symbol;
    }

   public double getAtomicMass(){
         return atomicMass;
   }
 
   public int getAtomicNumber(){
         return atomicNumber;
   }

  public boolean getIsMetal(){
        return isMetal;
  }

  public void setSymbol(String s){
       symbol = s;
 }

   public void setAtomicMass(double m){
        atomicMass = m;
   }

   public void setAtomicNumber(int n){
       atomicNumber = n;
 }

  public void setIsMetal(boolean m){
        isMetal = m;
  }
}
