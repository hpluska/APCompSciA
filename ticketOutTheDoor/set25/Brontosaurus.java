public class Brontosaurus extends Dinosaur {
    public boolean getEats(){
        return false;
    }

    public String getAnimalInfo(){
        String result = super.getAnimalInfo();
        return super.getAnimalInfo() + " I am a vegetarian ";

    }
}
