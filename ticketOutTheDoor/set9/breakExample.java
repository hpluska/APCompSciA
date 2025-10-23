public class breakExample {
    public static void main(String args[]) {
        String message = "";
        int j = 2;

        switch (j) {

            case 1:
            case 2:
            case 3:
                message = "low";
                break;

            case 4:
            case 5:
            case 6:
                message = "high";
                break;

            case 7:
                message = "lucky";
        }

        System.out.println(message);// low is printed
    }
}
