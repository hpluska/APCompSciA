public class test{
    public static int reverse = 0;
    public static int heads = 0;
    public static void main(String args[]){
        //System.out.println(reverseNumRecursion(1234, 3));
        // System.out.println(reverseNum(1234, 3));

        int headsInARow = 10; // Number of heads required in a row
        
        int flips = countFlips(headsInARow);
        System.out.println(flips);
        //System.out.println(decToBinRecur(8));
    }

    public static int reverseNum(int n, int digits){
        while(n > 0){
            reverse += n%10 * Math.pow(10, digits);
            digits--;
            n /= 10;
        }
        return reverse;
    }

    public static int reverseNumRecursion(int n, int digits){
        
        if(n == 0){
            return reverse;
        }else{
            return (int)(n%10 * Math.pow(10, digits)) + reverseNumRecursion(n/10, digits - 1);
        }
    }


    public static int countFlips(int headsInARow) {
        // Base case: If required number of heads reached, return 0 flips needed
        if (headsInARow == 0) {
            return 0;
        }

        if (Math.random() < 0.5) {
            System.out.println("Heads");
            return 1 + countFlips(headsInARow - 1);
        } else {
            System.out.println("Tails");
            return 1 + countFlips(headsInARow);
        }
    }
    int count2 = 0;
    public static int countFlips2(int headsInARow, int goal) {
        
        // Base case: If required number of heads reached, return 0 flips needed
        if (headsInARow == 0) {
            return 0;
        }

        if (Math.random() < 0.5) {
            
            return 1 + countFlips2(headsInARow - 1, goal);
        } else {
            
            return 1 + countFlips2(goal, goal);
        }
        
        
    }



    static int bin = 0, count = 0;
    public static long decToBin(int decimal){
        int count = 0;
		long output = 0;
		while(decimal > 0){
			output += (long)((decimal%2)*Math.pow(10, count));
		    decimal = decimal/2;
			count++;


		}
        return output;
    }

    public static int decToBinRecur(int decimal) {
        if (decimal == 0) {
            return 0;
        } else {
            return decimal % 2 + 10 * decToBinRecur(decimal / 2);
        }
    }
}