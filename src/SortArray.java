import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int [] num1 = new int [] {21, 23, 24, 40, 75, 76, 78, 77, 900, 2100, 2200, 2300, 2400, 2500};
        int [] num2 = new int [] {10, 11, 41, 50, 65, 86, 98, 101, 190, 1100, 1200, 3000, 5000};
        int [] num3 = new int[num1.length + num2.length];
        int i=0, j=0;
        for (int k=0; k<num3.length; k++) {

            if (i > num1.length-1) {
                int a = num2[j];
                num3[k] = a;
                j++;
            }
            else if (j > num2.length-1) {
                int a = num1[i];
                num3[k] = a;
                i++;
            }
            else if (num1[i] < num2[j]) {
                int a = num1[i];
                num3[k] = a;
                i++;
            }
            else {
                int b = num2[j];
                num3[k] = b;
                j++;
            }
        }

        System.out.println(Arrays.toString(num3));
    }
}

