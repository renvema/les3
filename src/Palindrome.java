import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter text:");
        String phrase =  scan.nextLine();
        String replace = phrase.replaceAll("[^A-Za-z1-9]", "");
        System.out.println(replace.equalsIgnoreCase(reverseByStringBuilder(replace)));
    }
    public static String reverseByStringBuilder(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    }
