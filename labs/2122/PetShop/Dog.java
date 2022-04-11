public class Dog extends Pet { 
    
    private String breed; 

    public Dog(String n, String b) { 
        super(n, "dog"); 
        breed = b; 
    } 

    public void printPetInfo() { 

        super.printPetInfo();
        System.out.println(" of breed " + breed);
    } 

    public void speak(){
        System.out.println("ruff!");
    }

}
