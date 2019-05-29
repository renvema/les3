import java.math.*;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner factorial = new Scanner (System.in);
        System.out.print("Enter a number>");
       int number = factorial.nextInt();
        BigInteger result = BigInteger.valueOf(1);
       for (int i=1; i<=number; i++){
           result=result.multiply(BigInteger.valueOf(i));
       }
        System.out.println(result);
    }
}
