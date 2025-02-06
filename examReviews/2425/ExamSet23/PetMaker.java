public class PetMaker {

    public static void main(String args[]){
        // Pet pet1 = new Pet("Princess", "Gorilla");
        // Cat cat = new Cat("Roscoe", "Maine Coon");
        Fish fish1 = new Fish("Nemo", "Clownfish");
        Pet fish2 = new Fish("Dory", "Blue Tang");
        fish2.speak();
        fish1.speak();

        fish1.printPetInfo();
        fish2.printPetInfo();
        // PetOwner owner1 = new PetOwner(new Pet("Floppy", "Rabbit"), "Jerry");
        // owner1.printOwnerInfo();

        // PetOwner owner2 = new PetOwner(new Dog("Arty", "Pug"), "Kris");
        // owner2.printOwnerInfo();

    }
    
}
