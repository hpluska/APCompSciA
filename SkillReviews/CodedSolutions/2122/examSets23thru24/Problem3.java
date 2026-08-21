
    class A {
        public A() {
            System.out.println("Inside A's constructor");
        }
    }
    class B extends A {
        public B() {
            System.out.println("Inside B's constructor");
        }
    }
    class C extends B {
        public C() {
            System.out.println("Inside C's constructor");
        }
    }
    public class Problem3 {
        public static void main(String[] args) {
            /** Statements for questions go here **/
            System.out.println((new C() instanceof B));
        }
    }
    

