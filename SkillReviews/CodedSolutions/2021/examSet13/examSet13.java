public class examSet13{

    public static void main(String args[]){

        String message = "Hello JAVA!";
        int c = 0;

        for( int j = 0; j < message.length(); j++)
        {
        c = (int) message.charAt(j);
    
        System.out.print(c + ",");
        }
    }


}