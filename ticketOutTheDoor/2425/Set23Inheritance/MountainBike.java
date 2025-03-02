public class MountainBike extends Bicycle{
    public String type;
    public MountainBike(String t, int w){
        super(w);
        type = t;
    }

    public String bikeInfo(){

        return "mountain bike";
    }

    public String getType(){
        return type;
    }


}