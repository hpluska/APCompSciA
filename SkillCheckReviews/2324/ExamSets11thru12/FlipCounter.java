public class FlipCounter {
    public static void main(String args[]){
        int flips = 0;
        int streak = 10;
        int heads = 0;
        while(heads < streak){

            if(Math.random() < .5){
                heads++;
            }else{
                heads = 0;
            }
            flips++;
        }
        System.out.println(flips);
    }
}
