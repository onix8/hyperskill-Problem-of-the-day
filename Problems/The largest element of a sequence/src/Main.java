import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int next;
        while (scanner.hasNextInt()) {
            next = scanner.nextInt();
            if (next == 0) {
                break;
            }
            if (next > max) {
                max = next;
            }
        }
        System.out.println(max);
    }
}