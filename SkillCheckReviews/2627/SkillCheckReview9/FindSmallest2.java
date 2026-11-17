public class FindSmallest2{
    public static void main(String args[]){
        int num = 123056;
        int numLen = (int)(Math.log10(num) + 1);
        int smallest = num % 10;
        for(int i = 0; i < numLen; i++){
            if(num % 10 < smallest){
                smallest = num%10;
            }
            num /= 10;
        }
        System.out.println(smallest);
    }
}