public class PrimeChecker {
    public static void main(String args[]){
        int num = 171344;
        int count = 0;
        for(int i = num; i > 0; i = i/100){
            int temp = i % 100;
            boolean isPrime = true;

            for(int j = 2; j < 10; j++){
                if(temp % j == 0){
                    isPrime = false;
                }
            }

            if(isPrime){
                count++;
            }
        }
        System.out.println(count);
    }
}
