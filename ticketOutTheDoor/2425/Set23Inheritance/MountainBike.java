public class MountainBike extends Bicycle{
    public String type;
    public MountainBike(String t, int w){
        super(w);
        type = t;
    }

    public void bikeInfo(){

        System.out.println("Mountain Bike");
    }

    public String getType(){
        return type;
    }


}