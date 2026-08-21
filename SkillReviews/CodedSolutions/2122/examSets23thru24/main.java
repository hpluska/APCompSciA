import java.util.Arrays;

public class main {

    public static void main(String args[]){
        LightBoard lb = new LightBoard(10, 10);

        boolean lights[][] = lb.getLights();

        for(int r = 0; r < lights.length; r++){
            System.out.println(Arrays.toString(lights[r]));
        }
        System.out.println(lb.evaluateLight(1, 1));


    }
    
}
