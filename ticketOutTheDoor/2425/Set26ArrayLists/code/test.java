import java.util.ArrayList;
import java.util.List;

public class test{

    private static ArrayList<String> songs = new ArrayList<String>();
    private static ArrayList<String> downloadedSongs = new ArrayList<String>();

    public static void main(String args[]){

        ArrayList i = new ArrayList(); //creates an ArrayList of whatever you want
        i.add(1); //adds 1 to the end of the list
        i.add(2); //adds 2 to the end of the list
        i.add(3); //adds 3 to the end of the list

        System.out.println(i.size());
        
        for(int j = 0; j < i.size(); j++){ //size() is used to get the length of the array
        
        System.out.println(i.get(j)); //get() is used to get the value at position j
        
        }

        ArrayList<Integer> i2 = new ArrayList<Integer>(); // creates an ArrayList of Integer objects
        i2.add(1); // adds 1 to the end of the list
        i2.add(2); // adds 2 to the end of the list
        i2.add(3); // adds 3 to the end of the list

        for (int tempValue : i2) { // gets each Integer in ArrayList i and assigns it to tempValue

            System.out.println(tempValue); // prints the tempValue

        }

    songs.add("A");
    songs.add("B");
    songs.add("C");

    downloadedSongs.add("new song");
    downloadedSongs.add("B");
    downloadedSongs.add("another song");
    downloadedSongs.add("C");

    songs = updateSongs(downloadedSongs);

    for(String s:songs){
        System.out.println(s);
    }

    
    }

    private static ArrayList<String> updateSongs(ArrayList<String> dList){
        boolean inList = false;

        for(int j = 0; j < dList.size(); j++){
            for(String s:songs){
                if(dList.get(j).equals(s)){
                    inList = true;
                }
            }
            if(!inList){
                songs.add(dList.get(j));

            }
            inList = false;
        }

        return songs;
    }
    

    
}