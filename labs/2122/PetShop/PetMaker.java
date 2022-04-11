public class PetMaker {

    public static void main(String args[]){
        Pet pet1 = new Pet("Floppy", "rabbit");
        Dog pet2 = new Dog("Arty", "pug");

        //PetOwner owner2 = new PetOwner(pet2, "Kris"); 
        //owner2.printOwnerInfo();

        Pet pet3 = pet2;//assign a Dog to a Pet

        pet3.printPetInfo();

    }
    
}
