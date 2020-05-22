// Posted from EduTools plugin
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();

        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int b3 = sc.nextInt();

        if (       a1 == b1 && a2 == b2 && a3 == b3
                || a1 == b1 && a2 == b3 && a3 == b2
                || a1 == b2 && a2 == b1 && a3 == b3
                || a1 == b2 && a2 == b3 && a3 == b1
                || a1 == b3 && a2 == b1 && a3 == b2
                || a1 == b3 && a2 == b2 && a3 == b1) {
            System.out.println("Box 1 = Box 2");
        }
        else {
            if (       a1 >= b1 && a2 >= b2 && a3 >= b3
                    || a1 >= b1 && a2 >= b3 && a3 >= b2
                    || a1 >= b2 && a2 >= b1 && a3 >= b3
                    || a1 >= b2 && a2 >= b3 && a3 >= b1
                    || a1 >= b3 && a2 >= b1 && a3 >= b2
                    || a1 >= b3 && a2 >= b2 && a3 >= b1) {
                System.out.println("Box 1 > Box 2");
            }
            else {
                if (       a1 <= b1 && a2 <= b2 && a3 <= b3
                        || a1 <= b1 && a2 <= b3 && a3 <= b2
                        || a1 <= b2 && a2 <= b1 && a3 <= b3
                        || a1 <= b2 && a2 <= b3 && a3 <= b1
                        || a1 <= b3 && a2 <= b1 && a3 <= b2
                        || a1 <= b3 && a2 <= b2 && a3 <= b1) {
                    System.out.println("Box 1 < Box 2");
                }
                else {
                        System.out.println("Incomparable");
                }
            }
        }

    }
}