// Posted from EduTools plugin
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int n = sc.nextInt();
        int i = 1;
        int m;
        sc.nextLine();
        while (i <= n) {
            m = sc.nextInt();
            if (h >= m) {
                System.out.println("Will crash on bridge " + i);
                break;
            }
            i++;
        }
        if (i > n) {
            System.out.println("Will not crash");
        }
    }
}