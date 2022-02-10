public class PetDriver {

    public static void main(String args[]){
        Pet p = new Pet(true, "Spider", 8);
        Cat c = new Cat("Roscoe");
        Fish f = new Fish("Nemo");

        System.out.println(p.toString());      

    }
    
}
