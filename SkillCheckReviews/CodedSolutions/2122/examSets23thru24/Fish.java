public class Fish extends Pet{
    
    public String name;
    public Fish(String n){
        super(false, "fish", 0);
        this.name = n;
    }
    
    public void speak(){   
        System.out.println("Blub, Blub");
    }
    
    public String toString() {
 		return "My name is " + name;
    }
    
}

