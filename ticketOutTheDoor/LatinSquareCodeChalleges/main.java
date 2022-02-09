import java.util.Arrays;

public class main{

    public static void main(String args[]){
        int temp[][] = makeLatinSquarePluska();
        for(int i = 0; i < temp.length; i++){
            System.out.println(Arrays.toString(temp[i]));
        }
        

    }

    /**
     * WORKS!
     * @return
     */
    public static int[][] makeLatinSquareAlexDirk(){
        int[] firstRow = {0, 1, 2, 3, 4};
        int[][] arr2d = new int[5][5];
        for(int col = 0; col < firstRow.length; col++){
            arr2d[0][col] = firstRow[col];        
        }

        for(int r = 1; r < arr2d.length; r++){
            for(int c = 0; c < arr2d[0].length;c++){
                arr2d[r][c] = arr2d[0][(c + r) %arr2d[0].length];
            }
        }
        return arr2d;
    }

    /**
     * WORKS!
     * @return
     */
    public static int[][] makeLatinSquareTeamBraedon(){
        int[] firstRow = {0, 1, 2, 3, 4};
        int[][] arr2d = new int[5][5];

        for(int col = 0; col < firstRow.length; col++){
            arr2d[0][col] = firstRow[col];        
        }
//your algorithm
        for(int r = 1; r < arr2d.length; r++){
            for(int c = 0 ;c < arr2d[r].length; c++){
                if((c - r) < 0){
                    arr2d[r][arr2d.length + c - r] = arr2d[0][c];
                }else{
                    arr2d[r][c-r] = arr2d[0][c];
                }
            }
        }
        
        return arr2d;
    }

    public static int[][] makeLatinSquarePluska(){
        int[] firstRow = {0, 1, 2, 3, 4};
        int[][] arr2d = new int[5][5];

        for(int col = 0; col < firstRow.length; col++){
            arr2d[0][col] = firstRow[col];        
        }
        for(int row = 1; row < arr2d.length; row++){
            for(int col =row; col < row + arr2d.length; col++){
                //copies the prevous row
                //arr2d[row][col%arr2d.length] = arr2d[row - 1][col%arr2d.length];
                //works for any value of offset
                int offset = 1;
                arr2d[row][col%arr2d.length] = arr2d[row - 1][(col+offset)%arr2d.length];
            }
        }
        return arr2d;
    }
}