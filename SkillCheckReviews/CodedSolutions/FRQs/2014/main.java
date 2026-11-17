public class main{
    public static void main(String args[]){
        int arr[] = {33, 22, 11};
        System.out.println(findMountain(arr));
        
    }

    static int findMountain(int arr[]){
        for(int i = 1; i < arr.length -1;i++){
            if(arr[i] > arr[i-1] && arr[i] > arr[i +1]){
                return i;
            }
        }
        return -1;
    }
}