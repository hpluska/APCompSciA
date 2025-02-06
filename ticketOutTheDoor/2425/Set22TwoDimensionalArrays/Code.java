
    import java.io.*; 
    import java.util.*;
public class Code{

 

    public static void main(String args[]){
        String gradebook[][] = {{"5","4.5","3","4","3.5"},
                                {"2","3","2.5","4","R"},
                                {"4","1","3.5","5","4"},
                                {"5","2","3.5","3","4.5"}};
        //String gradebook[][] = {{"5","4.5","3","4","3.5"}, {"2","3","2.5","4","R"}, {"4","1","3.5","5","4"}, {"5","2","3.5","3","4.5"}};
        // String gradebook2[][] = new String[gradebook.length+1][7];

        // for(int row = 0; row<gradebook.length; row++){
        //     for(int col = 0; col<gradebook[row].length; col++){
        //         gradebook2[row][col] = gradebook[row][col];
        //     }
        // }
        // for(int a = 0; a < gradebook2.length; a++){
        //     System.out.println(Arrays.toString(gradebook2[a]));
        // }

        for (int row = 0; row < gradebook.length; row++) {
            for (int col = 0; col < gradebook[row].length; col++) {
                System.out.print(gradebook[row][col] + " , ");
            }
            System.out.println();
        }
    }

}