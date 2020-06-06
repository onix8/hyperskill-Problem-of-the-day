import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int n;
        boolean symmetric = true;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n && symmetric; i++) {
            for (int j = 0; j < n && symmetric; j++) {
                symmetric = matrix[i][j] == matrix[j][i];
            }
        }

        System.out.println(symmetric ? "YES" : "NO");
    }
}