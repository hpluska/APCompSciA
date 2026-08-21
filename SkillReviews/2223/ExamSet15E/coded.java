public class coded{
    public static void main(String args[]){
        String arr1[] = {"apple", "bear", "Timberline", "Thanksgiving"};
        String arr2[] = {"pear", "light", "school", "Friday"};
        String result[] = new String[arr1.length];

        for(int i = 0; i<arr1.length;i++){
            String half1 = arr1[i].substring(0, arr1[i].length()/2);
            String half2 = arr2[i].substring(arr2[i].length()/2);
            result[i] = (half2 + half1).toLowerCase();   
        }


        int arr[] = {11, 22, 33, 22, 11};
        int valleyIndex = -1;
        for(int i = 1; i < arr.length - 1; i++){
            if(arr[i - 1]>arr[i] && arr[i+1] > arr[i]){
                valleyIndex = i;
                break;
            }
        }
        System.out.println(valleyIndex);

        int result = 0;
        for(int x : arr){
            if(x % num == 0){
                result += x;
            }
        }


    }
}