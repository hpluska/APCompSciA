public class test{
    public static void main(String[] args){
        Recursion.aRecursiveMethod();
    }
}

class Recursion{
    static int count = 0;
    public static void aRecursiveMethod(){
        count++;
        while(count < 4)
            aRecursiveMethod();
    }
}


