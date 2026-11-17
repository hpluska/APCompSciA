public class Main{

    public static void main(String args[]){
        int max = Integer.parseInt(args[0]);
        int min = max*-1;
        int rand = (int)((Math.random()*(max - min))-max);
        System.out.println(rand);



    }
}