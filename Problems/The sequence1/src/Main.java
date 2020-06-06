import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int tmp;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            tmp = scanner.nextInt();
            max = tmp % 4 == 0 ? Math.max(tmp, max) : max;
        }
        System.out.println(max);
    }
}