public class BinSearch{
    public static void main(String[] args){
        int[] values = {1, 2, 3, 4, 5, 8, 8, 8};  
        int target = 8; 

        System.out.println(search(values, target));
    }

    public static int search(int arr[], int target){
        int start = 0;    
        int end = arr.length - 1;    
        while (start <= end)   {      
            int mid = (start + end) / 2;     
            /* Calculate midpoint */    
            if (target < arr[mid]){        
                end = mid - 1;      
            }else if (target > arr[mid]){        
                start = mid + 1;      
            }else{        
                return mid;      
            }    
        }
        return -1;
    }
}