public class ASCIIValues {
    public static void main(String[] args) {
        String str = "Harini";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) + " = " + (int)str.charAt(i));
        }
    }
}
