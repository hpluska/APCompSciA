public class Cat extends Pet{
    private String breed;
    public Cat(String n, String b){
        super(n, "Cat");
        breed  = b;
    }

    public void speak(){   
        System.out.println("Meow, Meow");
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
