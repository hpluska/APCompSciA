public class test{
static int here = 0;
    public static void main(String args[]){
      showMe("WATCH");
      
        

    }




public static void showMe(String arg){


    int len = arg.length();
    if(len > 1){
        String temp = arg.substring(0, len-1);
        System.out.println(temp);
        showMe(temp);
    }
}

}