// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        String string = new Scanner(System.in).nextLine();
        boolean up = true;
        boolean down = true;

        // up
        Scanner str1 = new Scanner(string);
        int i = str1.nextInt();
        int n = 0;
        do {
            n = str1.nextInt();
            if (n == 0) {
                break;
            }
            if (i >= n) {
                i = n;
                up = true;
            } else {
                up = false;
                break;
            }
        } while (str1.hasNextInt());

        // down
        Scanner str2 = new Scanner(string);
        int i2 = str2.nextInt();
        int n2 = 0;
        do {
            n2 = str2.nextInt();
            if (n2 == 0) {
                break;
            }
            if (i2 <= n2) {
                i2 = n2;
                down = true;
            } else {
                down = false;
                break;
            }
        } while (str2.hasNextInt());

        if (up || down) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}