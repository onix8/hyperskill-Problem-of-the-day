// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int count = 0;
        while (i != 0) {
            i = sc.nextInt();
            if (i != 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}