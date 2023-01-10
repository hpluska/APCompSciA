public class ElementMaker {
    public static void main(String arg[]){
        Element nitrogen = new Element("N", 14.0, 7);
        System.out.println(nitrogen.getSymbol());
        System.out.println(nitrogen.getAtomicMass());
       System.out.println(nitrogen.getAtomicNumber());
       System.out.println(nitrogen.getIsMetal());
       nitrogen.setAtomicMass(15.0);
       System.out.println(nitrogen.getAtomicMass());
   
    }
}
