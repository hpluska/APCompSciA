public class Square{
    static int[][] square = new int[5][5];

    public static void main(String args[]){
        makeFirstRow();
        int latinSquare[][] = makeLatin();
        for(int row = 0; row < latinSquare.length;row++){
            for(int col = 0; col < latinSquare[row].length;col++){
                System.out.print(latinSquare[row][col]);
            }
            System.out.println();
        }
    }

    static void makeFirstRow(){
        for(int i = 0; i < square.length; i++){
            square[0][i] = i;
        }
    }

    static int[][] makeLatin(){
        for(int row = 1; row < square.length; row++){
            for(int col = 0; col < square[row].length; col++){
                if(col == 0){
                    square[row][col] = square[row - 1][square.length-1];
                }else{
                    square[row][col] = square[row -1][col -1];
                }
            }
        }
    return square;  
        
    }
    
}
