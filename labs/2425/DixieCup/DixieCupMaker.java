import java.util.Arrays;

public class DixieCupMaker {
   public static void main(String args[]){
      DixieCup[] dixieCupArray = new DixieCup[5]; 
      for(int c = 0; c < dixieCupArray.length; c++){
         //if(Math.random() > .5){
               //dixieCupArray[c] = new DixieCup();
         //}else{
              int contents = (int)(Math.random()*6 + 1);
              dixieCupArray[c] = new DixieCup(contents);
         //}
      }
         dixieCupArray[0].addItem("paper clip");
         String[] cupContents = dixieCupArray[0].getItems();

         System.out.println(Arrays.toString(cupContents));

         dixieCupArray[0].removeItem();
         cupContents = dixieCupArray[0].getItems();
         System.out.println(Arrays.toString(cupContents));


   } 
}
