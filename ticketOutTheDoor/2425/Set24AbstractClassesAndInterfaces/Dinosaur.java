public class Dinosaur implements Animal {
    int age;
    String type;
    @Override
    public void setAge(int a) {
        age = a;
        
    }

    @Override
    public void setType(String t) {
        type = t;
        
    }

    @Override
    public boolean getEats() {
        return true;
    }

    public String getAnimalInfo(){
        return "I am a " + age + " year old " + type;
    }
    
}
