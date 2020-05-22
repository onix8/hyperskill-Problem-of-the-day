// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double count = 0;
        double sum = 0;
        double result;
        for (; a <= b; a++) {
            if (a % 3 == 0) {
                sum += a;
                count++;
            }
        }
        result = sum / count;
        System.out.println(result);
    }
}