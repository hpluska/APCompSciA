public class CheckDigit { 
    //Declare the below private int variable to keep track
    //of incorrect check digits
    private int incorrectDigit = 0;
    /** 
    *    Returns the check digit for num 
    *    Precondition: The number of digits in num is between 
    *    one and six, inclusive. 
    *    num >= 0 
    */ 
    public int getCheck(int num) 
    { 
        //getCheck algorithm not implemented
        //so we will just return a random number 
        //for testing purposes
        return (int)(Math.random()*10);
    } 
    
    /** 
    *    Returns true if numWithCheckDigit is valid, or false otherwise, 
    *    as described in part (a)
    *    Precondition: The number of digits in numWithCheckDigit is 
    *    between two and seven, inclusive. 
    *    numWithCheckDigit >= 0 
    */ 
    public boolean isValid(int numWithCheckDigit) { 
        
        if(numWithCheckDigit%10 == getCheck(numWithCheckDigit/10)){
            //if the last digit in numWithCheckDigit is
            //equal to value returned by getCheck, then return true
            return true;
        }
        //otherwise increment invalidDigit and return false
        incorrectDigit++;
        return false;
    } 

    /**
     * returns the number of incorrectDigits
     * @return
     */
    public int getIncorrectDigit(){
        return incorrectDigit;
    }
    
}

    
    