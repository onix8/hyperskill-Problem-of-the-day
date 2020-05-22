// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        int n = new Scanner(System.in).nextInt();
        int count = 0;
        boolean stop = false;
        for (int i = 1; !stop ; i++) {
            for (int j = 0; j < i; j++) {
                if (count < n) {
                    System.out.print(i + " ");
                    count++;
                } else {
                    stop = true;
                    break;
                }
            }
        }
    }
}