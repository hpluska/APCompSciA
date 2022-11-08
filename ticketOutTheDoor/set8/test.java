public class test{

    public static void main(String args[]){
        int x = 79, y = 46, z = -3; 
        double d = 13.89, jj = 40.0; 
        boolean b = true, c = false; 
        
        if(x == y && !(z < 0) || b && c){
            System.out.println("this is if"); 
        }else{
            System.out.println("this is else"); 
        } 

        if( x != y && y==z && b || !c){
            System.out.println("this is if"); 
        }else{
            System.out.println("this is else"); 
        }

        String a1 = "dog";
        String b1 = "cat";
        if(a1.equals(b1)){
            System.out.println("same");
        }
    }
}