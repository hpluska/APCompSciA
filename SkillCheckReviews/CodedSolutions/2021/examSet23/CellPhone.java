package examSet23;

public class CellPhone extends Phone {

    private double longitude;
    private double latitude;
    public CellPhone(int ac, int p, int ln, double lat, double lng){
        super(ac, p, ln);
        latitude = lat;
        longitude = lng;
    }

    public void updateLocation(){

    }

    public double getLongitude(){
        return longitude;
    }

    public double getLatitude(){
        return latitude;
    }

    public String toString(){
        String s = super.toString();
        return s + "; (" + longitude + ", " + latitude + ")";
    }
}