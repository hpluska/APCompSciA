public class Pet {
 
    private boolean vegetarian;
    private String type;
    private final int noOfLegs;
 
    public Pet(boolean vegetarian, String type, int noOfLegs){
        //sets the variables vegetarian, type, and noOfLegs declared
        //in this class to the parameters passed in the constructor
        this.vegetarian = vegetarian;
        this.type = type;
        this.noOfLegs = noOfLegs;
    }
    
    public boolean getEats(){
        return vegetarian;
    }
    
    public int getLegs(){
        return noOfLegs;
    }

    public String getType(){
        return type;
    } 

    public String toString() {
 		return "I am a : " + type;
    }
}
