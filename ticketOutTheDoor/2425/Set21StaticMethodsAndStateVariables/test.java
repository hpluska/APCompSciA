public class test {

    public static int x;//no object required
    public int y;//object required
    public static void main(String args[]){
        x = 0;
        test a = new test();
        a.y = 100;
    }

    public int getY(){
        return y;
    }

    
    public static int getX(){
        return x;
    }
}
