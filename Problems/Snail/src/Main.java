import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int h = scanner.nextInt();  // 10
        int a = scanner.nextInt();  //  3
        int b = scanner.nextInt();  //  1

        int rs = a - b;             //  2
        int ks = h / rs;            //  5
        //int pd = (ks - 1);

        System.out.println(ks);

    }
}