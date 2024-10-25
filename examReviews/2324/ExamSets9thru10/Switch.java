public class Switch {
    public static void main(String args[]){
        int x = 2, p = 5, y = -8;

        switch (x) {

            case 2:
                p++;
            case 3:
            case 4:
                y += (p--);
                break;
            case 5:
                y += (p++);
        }

        System.out.println(y);

        String s = "Red";
        int q = 0;
        switch(s){

            case "Red":
                q++;
            case "Green":
                q++;
            case "Blue":
                q++;
            case "Yellow":
                q++;
            default:
                q++;
        }
        System.out.println(--q);


    }
}