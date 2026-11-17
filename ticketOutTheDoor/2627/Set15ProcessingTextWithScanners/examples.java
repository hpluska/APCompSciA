public class examples{
    public static void main(String[] args) {
        String word = "AABABABAA"; //2
        String s = "ABA";
        int i = 0, count = 0;
        while( i < word.length()){
             if(word.indexOf(s, i) != -1){
                i = word.indexOf(s, i) + s.length();
                count++;
             }
             i++;
        }

        System.out.println(count);


    }
}