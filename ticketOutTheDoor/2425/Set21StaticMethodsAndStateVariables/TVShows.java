public class TVShows
{

	public String actor1 = "Don Knots";
	public static String actor2 = "Homer Simpson";
	public static int numShows = 0;
	public static int x = 59;
	public int y = 1059;
	public String showName;


	public TVShows(String nm)
	{
		numShows++;
		showName = nm;
	}

	public static int numberOfShows()
	{
		return numShows;
    }

    public static void setActor1(String act1)
    {
    //actor1 = act1;
    }
}
