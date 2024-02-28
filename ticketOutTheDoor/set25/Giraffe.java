public class Giraffe extends Animal2 {

    public Giraffe(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String speak() {
        return "gaaaaayayayayay";
    }

    public String toString(){
        return "I am a giraffe. " + super.toString();
    }


    
}
