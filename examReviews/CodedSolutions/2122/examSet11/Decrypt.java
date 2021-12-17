public class Decrypt{
    public static void main(String args[]){
        int num = Integer.parseInt(args[0]);
        String result = "";

        while(num > 0){
            char temp = (char)(num%100);
            result = temp + result;
            num /= 100;
        }
        
        System.out.println(result);
    }
}