public class BikeDriver{

    public static void main(String args[]){
        MountainBike mb = new MountainBike("Mountain", 2);
        Bicycle b = new Bicycle(2);
        b = mb;
        String i = b.bikeInfo();

        System.out.println(i);
        
    }
}