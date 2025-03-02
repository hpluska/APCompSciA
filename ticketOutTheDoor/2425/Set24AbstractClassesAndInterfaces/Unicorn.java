public class Unicorn implements Animal {
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
        
        return false;
    }

    public String getAnimalInfo(){
        return "I am a " + age + " year old " + type;
    }

    public void randomMethod(){
        System.out.println("More stuff about unicorns");
    }
    
}
