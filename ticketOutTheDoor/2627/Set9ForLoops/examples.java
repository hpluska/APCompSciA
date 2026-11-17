public class examples {
    public static void main(String[] args) {
        for (int number = 1; number <= 6; number++) {
            if (number == 4) {
                break;
            }

            System.out.println(number);
        }

        System.out.println("Loop complete.");
    }
}