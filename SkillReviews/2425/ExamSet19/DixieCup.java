public class DixieCup{

    private boolean isFull;
    private String itemsArray[];

    public DixieCup(){
        isFull = true;
    }

    public DixieCup(int i){
        itemsArray = new String[i];
        isFull = false;
    }

    public void addItem(String item){
        if(!isFull){
            for(int i = 0; i < itemsArray.length; i++){
                if(itemsArray[i] == null){
                    itemsArray[i] = item;
                    return;
                }
            }
        }
    }

    public boolean getIsFull(){
        
        if(itemsArray!=null){
            for(int i = 0; i < itemsArray.length; i++){
                if(itemsArray[i] == null){
                    return false;
                }
            }
        }
        return true;
    }
    
    public int getNumItems(){
        int count = 0;
        if(itemsArray!=null){
            for(int i = 0; i < itemsArray.length; i++){
                if(itemsArray[i] != null){
                    count++;
                }
            }
            return count;
        }
        return 0;
    }

    public void swapitems(int i1, int i2){
        String temp = itemsArray[i1];
        itemsArray[i1] = itemsArray[i2];
        itemsArray[i2] = temp;
    }

    public String toString(){
        String result = "";
        for(int i = 0; i < itemsArray.length; i++){
            result += itemsArray[i] + " ";
            if(getIsFull()){
                result += "The cup is full";
            }else{
                result += "The cup is not full";
            } 
        }
        return result;
    }
}
