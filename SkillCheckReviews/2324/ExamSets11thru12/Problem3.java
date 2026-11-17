public class Problem3 {
    public static void main(String args[]){
        long num = 8773846772L;
        String result = "";

        while(num > 0){
            result = (char)(num%100) + result;
            num/=100;
        }
        System.out.println(result);

    }
}
