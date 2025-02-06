// Driver code
public class BoxMaker {

    public static void main(String args[]) {

        // create boxes using the various constructors
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        double vol;

        // get volume of first box
        vol = mybox1.getVolume();
        // below prints Volume of mybox1 is 3000.0
        System.out.println(" Volume of mybox1 is " + vol);

        // get volume of second box
        vol = mybox2.getVolume();
        // below prints Volume of mybox2 is 0.0
        System.out.println(" Volume of mybox2 is " + vol);

        // get volume of cube
        vol = mycube.getVolume();
        // below prints Volume of mycube is 343.0
        System.out.println(" Volume of mycube is " + vol);

    }
}
