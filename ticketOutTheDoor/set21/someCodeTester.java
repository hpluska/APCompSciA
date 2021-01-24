public class someCodeTester {
 
        public static void main(String args[])
        {
        int s[] = {1,2,3,4,5,6};
        
        for(int g = 0; g < s.length; g++) 
            System.out.print(s[g] + " ");
            
        System.out.print("\n");
        testMethod(s);
    
        for(int g = 0; g < s.length; g++) 
            System.out.print(s[g] + " ");
        }//end main
        public static void testMethod(int pp[])
        {
        int len = pp.length;
        int t2[] = new int[len/2];
        int i = 0;
    
        for(int j=0; j<len/2; j++){
            i+=2;
            t2[j] = pp[i-1];
         }
        for(int k=0; k<t2.length; k++) 
            System.out.print(t2[k] + " ");
    
        System.out.print("\n");
        pp = t2; 
        }//endt testMethod
    } //end Tester
    

