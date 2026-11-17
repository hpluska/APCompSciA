import java.util.ArrayList;
import java.util.List;

public class test{

    public static void main(String args[]){
        List<String> students = new ArrayList<String>();
        students.add("Alex");
        students.add("Bob");
        students.add("Carl");
        for (int k = 0; k < students.size(); k++) {
            System.out.print(students.set(k, "Alex") + " ");
        }
        System.out.println();
        for (String str : students) {
            System.out.print(str + " ");
        }

        System.out.println(wordsWithCommas());
    }

    public static String wordsWithCommas(){
        List<String> listOfWords = new ArrayList<String>();
        listOfWords.add("one");
        listOfWords.add("two");
        listOfWords.add("three");

        String result = "{";
        int sizeOfList = listOfWords.size();
        for(int k = 0; k < sizeOfList;k++){
            result = result + listOfWords.get(k);
            if(k != sizeOfList-1){
                result = result + ",";
            }  
        }
        result = result + "}";
        return result;
    }
}