package examSet23;

public class main {

    public static void main(String args[]){
        //Below prints
        //Inside A's constructor
        //Inside B's constructor
        //B b = new B();

        //Below prints
        //Inside A's constructor
        //Inside B's constructor
        //Inside C's constructor
        //A a = new C();

        //Below prints
        //Inside A's constructor
        //Inside B's constructor
        //true
        //System.out.println((new B()) instanceof A);

        //Below prints
        //Inside A's constructor
        //Inside B's constructor
        //Inside C's constructor
        //true
        System.out.println((new C() instanceof A));


    }
}