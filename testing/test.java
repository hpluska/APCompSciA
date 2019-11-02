public class test{

    public static void main(String args[]){

         int unicode = 12345678;
            String wString = "a";
            char wChar = wString.charAt(0);//a now equals the character W
            int wUnicode = wChar;
            System.out.println(wUnicode);//prints 87
    }
}