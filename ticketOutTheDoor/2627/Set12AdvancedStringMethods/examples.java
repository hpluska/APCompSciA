public class examples{
    public static void main(String[] args) {
        String word = "AABABABAA"; //2
        String s = "ABA";
        int count =0;

        //Solution 1
        // int i = 0, count = 0;
        // while( i < word.length()){
        //      if(word.indexOf(s, i) != -1){
        //         i = word.indexOf(s, i) + s.length();
        //         count++;
        //      }
        //      i++;
        // }

        // System.out.println(count);

        //Solution 2
        String result = "";
        int i = 0;
        for(i = 0; i < word.length() - s.length();){

            if(word.substring(i, i + s.length()).equals(s)){
                count++;
                i += s.length();
            }else{
                result += word.charAt(i);
                i++;

            }
        }

        result += word.substring(i);
        System.out.println(count);
        System.out.println(result);


    }
}