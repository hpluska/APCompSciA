public class test{

    public static int a[] = {1, 2, 3, 4, 0, 0, 5};
    public static int sum = 0;
    public static void main(String args[]){
      //whatsItDo("WATCH");
      System.out.println(countEm(0));
      //System.out.println(reverseNum(1234));
      //showMe("Tuesday");

      //Skill 28.3 Exercise 1
      //reduceByOne(4);

      //Skill 28.4 Exercise 1 
      //calcMethod(16);
      //System.out.println("result  = " + calcMethod(16));

      //Skill 28.4 Exercise 2
      //System.out.println(goAgain("today", 1));

      //Skill 28.4 Exercise 3 
      //System.out.println(pls(4));

      //Skill 28.4 Exercise 4
      //homer(9);
       
    }

    //First problem in recursion review slides
    public static void whatsItDo(String str)
    {
       int len = str.length();
          if (len > 1)
          {
            String temp = str.substring(0, len - 1);
            System.out.println(temp);
            whatsItDo(temp);
          }
    }

    //Second problem in recursion review slides
    public static int countEm(int i){

        while(i<a.length-1){
            i++;
            sum+=a[i];
            System.out.println("sum = " + sum + "\n i = " + i);
            countEm(i); 
        }
    return sum;
    }

    //Third problem in recursion review slides
    static int reverse = 0;
    public static int reverseNum(int n){
        int numLength = (int)Math.log10(n);
        if(n == 0){
            return reverse;
        }
        reverse += n%10*Math.pow(10, numLength);
        System.out.println(reverse);
        return reverseNum(n/=10);
    }

    //Fourth problem in recursion review slides
    public static void showMe(String arg){
        int len = arg.length();
        if(len > 1){
            String temp = arg.substring(0, len-1);
            System.out.println(temp);
            showMe(temp);
        }
    }

/**
 * Skill 28.3 Exercise 1 
 * @param n
 */
public static void reduceByOne(int n){
    if(n > 0){
         System.out.println(n);
         reduceByOne(n-1);
         System.out.println(n);
    }
}

    /**
     * Skill 28.4 Exercise 1
     * @param num
     * @return
     */
    public static int calcMethod(int num)
    {
        if (num == 0)
        {
            return 10;
        }
    System.out.println(num);
    return num + calcMethod(num / 2);
    
    }

    /**
    * Skill 28.4 Exercise 2
    * @param str
    * @param index
    * @return
    */
    public static String goAgain(String str, int index) { 
        if (index >= str.length()) 
            return str; 
        
        return str + goAgain(str.substring(index), index + 1); 
    }

/**
 * Skill 28.4 Exercise 3 
 * @param n
 * @return
 */
public static int pls(int n)
{
     if (n == 0)
          return 5;
     else if (n == 1)
          return 11;
     else
          return pls(n - 1) + 2 * pls(n - 2);
}

/**
 * Skill 28.4 Exercise 4
 * @param n
 */
    public static void homer(int n)
    {
        if (n <= 1)
          System.out.print(n);
        else
          homer(n / 2);

    System.out.print("," + n);
    }

}