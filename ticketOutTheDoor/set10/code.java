public class code{

	public static void main(String args[]){
		//Skill 1 Exercise 1
		int j = 0;
		for(int g = 0; g < 5; g++){
    			j++;
		}
		System.out.println(j);//5
		
		int s = 1;
		for(int j2 = 3; j2 >= 0; j2--){
     			s = s + j2;
		}
		System.out.println(s);//7

		int m = 20;
		for(int i = 6; i > 0; i-=2){
     			m = m + i * i;
		}
		System.out.println(m);//76

		//Skill 1 Exercise 2
		String word = "BooB";
		String wordR = "";
		String letter = "";

		for(int w = word.length(); w>0; w--){
			letter = word.substring(w-1, w);
			wordR += letter;
		}

		if(word.equals(wordR)){
			System.out.println("Palindrome!");
		}
		else{
			System.out.println("Not!");
		}
	}
}
