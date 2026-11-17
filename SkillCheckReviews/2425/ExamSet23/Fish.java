public class Fish extends Pet{
    private String breed;
    public Fish(String n, String b){
        super(n, "Fish");
        breed  = b;
    }

    public void speak(){   
        System.out.println("Blub, Blub");
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
