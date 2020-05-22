// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int i = 1;
        long fctrl = 1;
        while (true) {
            fctrl = fctrl * i;
            if (fctrl > n) {
                break;
            }
            i++;
        }
        System.out.println(i);
    }
}