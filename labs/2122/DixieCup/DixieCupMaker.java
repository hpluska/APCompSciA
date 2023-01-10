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
   dixieCupArray[0].removeItem();
    String items[] = dixieCupArray[0].getItems();
    for(int i = 0; i < items.length; i++){
      System.out.println(items[i]);
    }
   




   } 
}
