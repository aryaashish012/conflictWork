package devops;

public class ReverseStringWithoutBuiltins {

    public static String reverse(String input) {
        if (input == null) {
            return null;
        }
        char[] chars = input.toCharArray();
        String reversed = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed += chars[i];           // simple concatenation
        }
        return reversed;
    }

    public static void main(String[] args) {
        String str = "Automation";
        System.out.println("Original : " + str);
        System.out.println("Reversed : " + reverse(str));
    }
}
