
public class test {
    public static void main(String args[]) {
        String toSearch = "AABABABAA";
        String find = "ABA";
        System.out.println(new Forrest(toSearch, find).getOccurences());
        System.out.println(new Grace(toSearch, find).getOccurences());
        System.out.println(new APSolution(toSearch, find).getOccurences());
    }
}

class Grace{
    int occurences = 0;
    public Grace(String toSearch, String find){
        String checking = toSearch;
        String wanted = find;
        
        for (int i = 0; i < checking.length(); i = wanted.length() + checking.indexOf(wanted, i)){
            if (checking.indexOf(wanted, i) == -1){
                break;
            }
            occurences++;
        }  
    }
    public int getOccurences(){
        return occurences;
    }
}

class Forrest{
    int counter = 0;
    public Forrest(String toSearch, String find){
        int pos = 0;

        while(pos < toSearch.length()){
            int i = toSearch.indexOf(find, pos);
            if(i >= 0){
                counter++;
                pos = i + find.length();
            }else{
                break;
            }
            
        }
        
    }
    public int getOccurences(){
        return counter;
    }
}

class APSolution{
    int count = 0;
    public APSolution(String toSearch, String find){
        int i = 0;
        while (i < toSearch.length() - find.length()) {
            if (find.equals(toSearch.substring(i, i + find.length()))) {
                count++;
                i += find.length();
            } else {
                i++;
            }
        }
    }
    public int getOccurences(){
        return count;
    }
}



