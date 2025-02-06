public class TVShowMaker {
    public static void main(String args[]){
        TVShows show1 = new TVShows("Simpsons");
        TVShows show2 = new TVShows("walking dead");
        TVShows show3 = new TVShows("south park");
        show3.showName = "Game of Thrones";

        show2.numShows = 100;
        System.out.println(show3.showName);
        System.out.println(TVShows.numShows);
    }
}
