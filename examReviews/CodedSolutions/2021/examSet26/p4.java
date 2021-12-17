public class p4 {

    public static void whatsItDo(String str) {
        int len = str.length();
        if (len > 1) {
            String temp = str.substring(0, len - 1);
            whatsItDo(temp);

            System.out.println(temp);
        }
    }

    public static void main(String args[]) {
        whatsItDo("WATCH");
    }
}
