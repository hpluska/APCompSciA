public class PetOwner { 
    private Pet thePet; 
    private String owner; 

    public PetOwner(Pet p, String o) { 
        thePet = p; 
        owner = o; 
    } 

    public void printOwnerInfo() { 
    
        thePet.printPetInfo();
        System.out.println("Owned by " + owner);
    } 

} 
