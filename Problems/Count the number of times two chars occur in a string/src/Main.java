import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String string  = scanner.nextLine();
        String[] input = string.split(" ");
        String str1 = input[0];
        String str2 = input[1].substring(0, 1) + input[2].substring(0, 1);
        String sub;
        int n = 0;
        if (str1.length() >= 2) {
            for (int i = 0; i < str1.length() - 1; i++) {
                sub = str1.substring(i, i + 2);
                if (sub.equals(str2)) {
                    n++;
                }
            }
        }
        System.out.println(n);
    }
}