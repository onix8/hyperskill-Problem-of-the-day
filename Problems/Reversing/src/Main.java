import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n = scanner.nextInt();
        int digit3 = n % 10;
        int digit2 = (n / 10) % 10;
        int digit1 = n / 100;
        System.out.println(digit3 + "" + digit2 + digit1);
    }
}