public class problems {
    public static void showMe(int arg) { 
        if (arg < 10) { 
            showMe(arg + 1); 
        } else { 
            System.out.print(arg + " "); 
        } 
        //System.out.print(arg + " ");
    } 

    public static void whatsItDo(String str) { 
        int len = str.length(); 
        if (len > 1) { 
            String temp = str.substring(0, len - 1); 
            System.out.println(temp); 
            whatsItDo(temp); 
        } 
    }

    public static void puf(int n) { 
        if(n == 1) { 
            System.out.print("x"); 
        } else if( n%2 == 0){ 
            System.out.print("{"); 
            puf(n-1); 
            System.out.print("}"); 
        } else { 
            System.out.print("<"); 
            puf(n-1); System.out.print(">"); 
        } 
    }


    public static int addFun(int n) { 
        if (n <= 0) 
            return 0; 
        
        if (n == 1) 
            return 2; 
        
        return addFun(n - 1) + addFun(n - 2); 
    }

    public static void main(String args[]){ 
        showMe(0); 
        whatsItDo("WATCH");
        puf(5);
        System.out.println(addFun(6));
    }

}
