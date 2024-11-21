public class CountABA {
    public static void main(String args[]){
        String letters = "BBAABBAABBAA";
        String search = "ABA";
        int count = 0;

        for(int i = 0; i <= letters.length() - search.length(); i += 0){
            
            if(letters.substring(i, i + search.length()).equals(search)){
                count++;
                i += search.length();
            }else{
                i++;
            }
        }
        System.out.println(count);
    }
}
