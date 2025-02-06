public class StaticContextExample {

    public static String name;
    public static int age;

    public static void main(String args[]) {
        
        name = "Minjae";
        age = 17;
        System.out.println(methodA(3.14));
        // setName("Kellen"); //Illegal
    }

    public static double methodA(double x) {

        return x;
    }

    public void setName(String n) {

        name = n;// legal
    }
}
