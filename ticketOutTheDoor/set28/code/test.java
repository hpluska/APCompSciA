public class test{

    public static int a[] = {1, 2, 3, 4, 0, 0, 5};
    public static int sum = 0;
    public static void main(String args[]){
      whatsItDo("WATCH");
      //System.out.println(countEm(0));
      //System.out.println(reverseNum(1234));

      //reduceByOne(4);
      //System.out.println(pls(4));
      //homer(9);

      //showMe(0);
    }

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



    public static int countEm(int i){

        while(i<a.length){
            i++;
            sum+=a[i];
            countEm(i); 
        }
    return sum;
    }

    static int reverse = 0;
    public static int reverseNum(int n){
        int numLength = (int)Math.log10(n);
        if(n == 0){
            return reverse;
        }
        reverse += n%10*Math.pow(10, numLength);
        return reverseNum(n/=10);
    }

    

public static void showMe(String arg){


    int len = arg.length();
    if(len > 1){
        String temp = arg.substring(0, len-1);
        System.out.println(temp);
        showMe(temp);
    }
}

public static void reduceByOne(int n){
    if(n > 0){
         System.out.println(n);
         reduceByOne(n-1);
         System.out.println(n);
    }
}

public static int pls(int n)
{
     if (n == 0)
          return 5;
     else if (n == 1)
          return 11;
     else
          return pls(n - 1) + 2 * pls(n - 2);
}

public static void homer(int n)
{
     if (n <= 1)
          System.out.print(n);
     else
          homer(n / 2);

System.out.print("," + n);

}



public static void showMe(int arg)
{
    if (arg < 10)
    {
        showMe(arg + 1);
    }
    else
    {
        System.out.print(arg + " ");
    }
}

}