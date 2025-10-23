public class test{
    public static void main(String args[]){
        int num = 12345678;
        int reverse = 0;
        int length = (int)(Math.log10(num));
        System.out.println(length);

        // for(int n = num; n > 0; n /= 10){
        //     int last = n % 10;
        //     reverse += (int)(last * Math.pow(10, length));
        //     length--;
        // }

        for(int n = num; n > 0; n /= 10){
            int last = n % 10;
            reverse *= 10;
            reverse += last;
            System.out.println(reverse);
        }
    }
}