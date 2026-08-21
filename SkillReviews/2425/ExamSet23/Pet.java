public class Pet{
    private String name;
    private String species;
     
        public Pet(String n, String s){
            name = n;
            species = s;
        }
     
        public String getName(){
            return name;
        }
    
        public String getSpecies(){
            return species;
        }

        public String toString(){
            return getName() + " is a " + getSpecies();
        }

        public void speak(){
            System.out.println("in the parent");
        }
     
        public void printPetInfo() { 
            System.out.print(getName() + " is a " + getSpecies()); 
        }
    }
    