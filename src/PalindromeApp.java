import java.util.Scanner;

public class PalindromeApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter text:");
        String phrase = scan.nextLine();
        System.out.println(isPalindrome(phrase));
    }

    public static boolean isPalindrome(String text) {
        String replace = text.replaceAll("[^A-Za-z1-9]", "");

        return replace.equalsIgnoreCase(reverseByStringBuilder(replace));
    }

    public static String reverseByStringBuilder(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
