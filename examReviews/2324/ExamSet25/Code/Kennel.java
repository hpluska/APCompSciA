import java.util.ArrayList;

public class Kennel {

    private Pet pets[] = new Pet[5];

    public void allSpeak(){
        /* To be implemented in this part */
        for(Pet p:pets){
            p.getName();
            p.speak();
        }
    }
}
