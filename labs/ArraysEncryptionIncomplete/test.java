public class test{

    	public static void main(String args[]){

	String secret="1E90A90CE 0FA1B20E60E60A9168 0A71B20E309F 1B20E6 0A90A709F1BD09F168 0D00E11681D80A90CE168 09C1E209F1B20E30E10E613C 1B2 15A09F0D0 09F13C13C167";

	int places = 0;
	String temp ="";
	String[] secretChunks = secret.split(" ");
	int tempNum = 0;
	int conversion = 0;
	for(int i = 0; i < secretChunks.length; i ++){
	//System.out.println(secretChunks[i]);

		for(int j = 0; j <= secretChunks[i].length()-3; j+=3){
			temp = secretChunks[i].substring(j, j + 3);
			//System.out.print(temp + " ");
			for(int k = 2; k>=0 ; k--){

			   String letter = temp.substring(k, k+1);

				if(letter.charAt(0) >= 65){
					tempNum = letter.charAt(0) - 65+8;


				}else{
					tempNum = Integer.parseInt(letter);
				}
			   
				System.out.print(tempNum);
				//conversion += tempNum*Math.pow(16,k);
				
			}
			System.out.print(" ");
			//System.out.print(conversion + " ");
			conversion = 0;

		}
	temp = "";
	
	System.out.println();

	}

	}
}

