public class CountRolls {
    public static void main(String args[]){
        int num = 2;
        int streak = 7;
        int rolls = 0;
        int count = 0;
        while(count < streak){
            if((int)(Math.random()*6 + 1) == num){
                count++;
            }else{
                count = 0;
            }
            rolls++;
        }

        System.out.println(rolls);
    }
}
