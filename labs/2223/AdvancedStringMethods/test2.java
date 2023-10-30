public class test2 {
    public static void main(String args[]){
        String checking = "AABABABAA";
        String wanted = "ABA";
        int occurences = 0;
        for (int i = 0; i < checking.length(); i = wanted.length() + checking.indexOf(wanted, i)){

            if (checking.indexOf(wanted, i) == -1){
        
                break;
            }
        
            occurences++;
        }
        System.out.println(occurences);
    }
}
