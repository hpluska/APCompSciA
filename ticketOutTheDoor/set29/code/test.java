import java.util.ArrayList;
import java.util.List;

public class test{

    private static ArrayList<String> songs = new ArrayList<String>();
    private static ArrayList<String> downloadedSongs = new ArrayList<String>();

    public static void main(String args[]){

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
            for(int i = 0; i < songs.size(); i++){
                if(dList.get(j).equals(songs.get(i))){
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