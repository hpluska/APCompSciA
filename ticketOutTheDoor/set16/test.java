public class test{

	public static void main(String args[]){
		String people = "Bart~Kyle,Bugs-Marvin";
		String houses[] = people.split("~|,|-");

		System.out.println(houses[0]);//prints Bart
		System.out.println(houses[1]);//prints Kyle
		System.out.println(houses[2]);//prints Bugs
		System.out.println(houses[3]);//prints Marvin

            String s = "ENOUGH USE OF THE WORD THE" + "DUMMY";
            String sp[] = s.split("THE");
            System.out.println(sp.length-1);//prints 1
	    System.out.println(sp[0]);
            System.out.println(sp[1]);
	    System.out.println(sp[2]);


	}
}
