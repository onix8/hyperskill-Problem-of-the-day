// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        String str = new Scanner(System.in).nextLine();
        boolean up = true;
        for (int i = 0; !(i >= str.length() && str.length() <= 1) && i < str.length() - 1; i++) {
            if (str.charAt(i) != str.charAt(i + 1) - 1) {
                up = false;
                break;
            }
        }
        System.out.println(up);
    }
}