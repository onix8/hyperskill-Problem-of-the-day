import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int n;
        int m;
        int max = Integer.MIN_VALUE;
        int n1 = 0;
        int m1 = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        for (int i1 = 0, matrixLength = matrix.length; i1 < matrixLength; i1++) {
            int[] vector = matrix[i1];
            for (int i2 = 0, vectorLength = vector.length; i2 < vectorLength; i2++) {
                vector[i2] = scanner.nextInt();
                if (vector[i2] > max) {
                    max = vector[i2];
                    n1 = i1;
                    m1 = i2;
                }
            }
        }
        System.out.println(n1 + " " + m1);
    }
}
