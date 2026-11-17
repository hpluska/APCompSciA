public class PetMaker {

    public static void main(String args[]){
        Pet pet1 = new Pet("Princess", "Gorilla");
        Cat cat = new Cat("Roscoe", "Maine Coon");

      
        Pet pets[] = new Pet[2];
        pets[0] = pet1;
        pets[1] = cat;
        System.out.println(pets[1].toString());
        // Fish fish1 = new Fish("Nemo", "Clownfish");
        // Pet fish2 = new Fish("Dory", "Blue Tang");
        // fish2.speak();
        // fish1.speak();

        // fish1.printPetInfo();
        // fish2.printPetInfo();

        // Pet pet1 = new Pet("Sam", "Snake");
        // Dog pet2 = new Dog("Goldilocks", "Doodle");
        // PetOwner owner1 = new PetOwner(pet1, "Jerry");
        // owner1.printOwnerInfo();

        // PetOwner owner2 = new PetOwner(pet2, "Kris");
        // owner2.printOwnerInfo();

    }
    
}
