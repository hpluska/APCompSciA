public class Cat extends Pet{
    
    public String name;

    public Cat(String name){
        super(false, "cat", 4);
        this.name = name;
    }
    
    public void speak(){   
        System.out.println("Meow!");
    }
    
    public String toString() {
 	return super.toString() + "\nMy name is : " + name;
    } 
}

