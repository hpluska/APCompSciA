public class CodeWordChecker implements StringChecker{

    private int minLength, maxLength;
    private String search;

    public CodeWordChecker(int num1, int num2, String s1){
        minLength = num1;
        maxLength = num2;
        search = s1;
    }

    public CodeWordChecker(String s1){
        search = s1;
    }

    public boolean isValid(String s){
        if(s.length() < minLength || s.length() > maxLength){
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            if(s.substring(i,i+1).equals(search)){
                return false;
            }
        }
        return true;
    }
    
}
