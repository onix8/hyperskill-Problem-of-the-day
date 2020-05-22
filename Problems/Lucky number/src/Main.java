// Posted from EduTools plugin
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        BigInteger number = new BigInteger(scanner.nextLine());
        int length = String.valueOf(number).length() / 2;
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < length; i++) {
            sumRight += new BigInteger(String.valueOf(number.mod(BigInteger.valueOf(10)))).intValue();
            number = new BigInteger(String.valueOf(number.divide(BigInteger.valueOf(10))));
        }
        for (int i = 0; i < length; i++) {
            sumLeft += new BigInteger(String.valueOf(number.mod(BigInteger.valueOf(10)))).intValue();
            number = new BigInteger(String.valueOf(number.divide(BigInteger.valueOf(10))));
        }
        if (sumLeft == sumRight) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}