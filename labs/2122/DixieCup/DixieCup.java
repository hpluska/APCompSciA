public class DixieCup{

    private String itemsArray[];//null
    private boolean isFull;

    public DixieCup(int n){
          itemsArray = new String[n];//initialized
          isFull = false;
    }

    public DixieCup(){
        isFull = true;
        itemsArray = new String[0];//set to zero things
    }

    public void setIsFull(){
        isFull = true;
            for(int i = 0; i < itemsArray.length; i++){
                if(itemsArray[i] == null){
                    isFull = false;
                    System.out.println(isFull);
                    return;
                }
            }
            System.out.println(isFull);
    }

    public void addItem(String n){ 
        for(int i = 0; i < itemsArray.length; i++){
            if(itemsArray[i] == null){
                itemsArray[i] = n;
                //System.out.println(itemsArray[i]);
                break;
           }
         }
    setIsFull();
    }

    public String[] getItems(){
        return itemsArray;

    }

    public void removeItem(){ 
        for(int i = itemsArray.length - 1; i >= 0; i--){
            if(itemsArray[i] != null){
                itemsArray[i] = null;
                break;
           }
         }
   setIsFull();
   }
    
}