import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static String reverse(String text) {
        // write your code here
        int i = text.length() - 1; // last symbol index
        String reverseText = "";
        while (i >= 0) {
            reverseText += text.charAt(i);
            i--;
        }
        return reverseText;
    }
    public static boolean palindrome(String text) {
        // write your code here
        if (text.equals(reverse(text))) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}