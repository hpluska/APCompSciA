public class Code{

    public static void main(String args[]){

        int[] c = {1, 2, 3, 4};
    int[] d = c;
    d[1] = 99;
    d = new int[5];
    for(int i = 0; i < c.length; i++){
        System.out.println(c[i]);
    }
    }


}