import java.math.*;

public class FactorialApp {
    public static void main(String[] args) {
        BigInteger result = factorial(7);
        System.out.println(result);
    }

    public static BigInteger factorial(int value) {
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 1; i <= value; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
