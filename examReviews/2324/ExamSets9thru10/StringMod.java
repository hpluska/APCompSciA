public class StringMod {
    public static void main(String args[]){
        String letters = "AAAABA";
        String search = "AB";
        String result = "";
        boolean found = false;
        for(int i = 0; i <= letters.length() - search.length(); i++){
            
            if(letters.substring(i, i + search.length()).equals(search)){
                result = letters.substring(0, i) + letters.substring(i + search.length());
                i += search.length() - 1;
                found = true;
                break;
            }
        }
        if(!found){
            result = letters;
        }
        System.out.println(result);
    }
}
