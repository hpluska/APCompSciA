public abstract class Animal2 {
    private String name;

    public Animal2(String name){
        this.name = name;
    }
    public abstract String speak();

    public int getLegs(){
        return 4;
    }

    public String toString(){
        return "My name is " + name;
    }
}
