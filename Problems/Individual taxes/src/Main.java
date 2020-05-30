import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ints = new int[n];
        double[] ints1 = new double[n];
        for (int i = 0; i < n; i++) {
            ints[i] = scanner.nextInt();
        }
        int index = 1;
        double max = 0;
        for (int i = 0; i < n; i++) {
            ints1[i] = (ints[i] / 100d) * scanner.nextInt();
            if (ints1[i] > max) {
                index = i + 1;
                max = ints1[i];
            }
        }
        System.out.println(index);
    }
}