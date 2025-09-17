public class ReverseString {
    private  static String ReverseStringM(String text) {
        if (text.length() <= 1) {
            return text;
        }
        String lastChar = Character.toString(text.charAt(text.length() - 1));
        
        return lastChar + ReverseStringM(text.substring(0, text.length() - 1));

    }
    public static void main(String[] args) {
        System.out.print(ReverseStringM("abc"));
    }
}
