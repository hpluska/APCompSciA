public class exam5E{
    public static void main(String args[]){
        int x = 100;
        int y = 200;
        double z = Math.min(x, y);
        System.out.println(z);//prints 100.0

        //double a = 2;
        //double b = 4;
        //int c = Math.max(a, b); //error

        //int d = Math.pow(x, y);
        //System.out.println(d);

        int b = 11111111;
        int count = 0;
        double num = b%10*Math.pow(2,count);
        System.out.println((int)num);

        //int s = Math.sqrt(4);
        //System.out.println(s);//error

        //int c = Math.ceil(-155.6);//error
        //System.out.println(c);

        double f = Math.floor(-0.50);
        System.out.println(f);

        //int r = Math.random();
        //System.out.println(r);//error

        int r = Math.floor(Math.random()+100);
        System.out.println(r);
        
    }
}