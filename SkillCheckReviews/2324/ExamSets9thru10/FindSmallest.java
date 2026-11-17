public class FindSmallest {
    public static void main(String args[]){
        int num = 111119;
        int smallest = num%10;
        for(int i = num; i > 0; i /= 10){
            int temp = i %10;
            if(temp < smallest){
                smallest = temp;
            }
        }

        System.out.println(smallest);
    }
}
