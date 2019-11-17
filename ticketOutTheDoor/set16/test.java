public class test{

	public static void main(String args[]){
		String people = "Bart~Kyle,Bugs-Marvin";
		String houses[] = people.split("~|,|-");

		System.out.println(houses[0]);//prints Bart
		System.out.println(houses[1]);//prints Kyle
		System.out.println(houses[2]);//prints Bugs
		System.out.println(houses[3]);//prints Marvin
	


	}
}
