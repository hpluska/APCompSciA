public class Dog extends Pet{
    private String breed;
    public Dog(String n, String b){
        super(n, "Dog");
        breed  = b;
    }

    public void speak(){   
        System.out.println("Ruff, Ruff");
    }

    public String toString(){
        String msg = super.toString() + " of breed " + breed;
        return msg;
    }


    public void printPetInfo() { 
        super.printPetInfo();
        System.out.print(" of breed " + breed);
    }
}
