// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b <= c || a + b <= 0) {
            System.out.println("NO");
        }
        else {
            if (a + c <= b || a + c <= 0) {
                System.out.println("NO");
            }
            else {
                if (b + c <= a || b + c <= 0) {
                    System.out.println("NO");
                }
                else {
                    if (a != 0 && b != 0 && c != 0) {
                        System.out.println("YES");
                    }
                    else {
                        System.out.println("NO");
                    }
                }
            }
        }
    }
}