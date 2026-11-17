public class Problem3 {
    public static void main(String args[]){
        String search = "AABABABAA";
        String find = "ABA";
        int ind = search.indexOf(find);
        int count = 0;
        while(ind != -1){
            count++;
            ind = search.indexOf(find, ind + find.length());
        }
        System.out.println(count);
    }
}
