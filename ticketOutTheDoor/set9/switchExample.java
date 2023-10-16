public class switchExample{
    public static void main(String args[]){
        System.out.println("Think of a question");
        int option = (int)(Math.random()*3);

        switch(option){
            case 0:
                System.out.println("It is certain");
        
            case 1:
                System.out.println("It is doubtful");
         
            case 2:
                System.out.println("It is pointing to yes");
          

        }
    }
}