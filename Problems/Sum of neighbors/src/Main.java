import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String s;
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            s = sc.nextLine();
            if (s.contains("end")) {
                String stripS = s.replace("end", "");
                if (stripS.isEmpty()) {
                    break;
                } else {
                    arrayList.add(stripS);
                }
            }
            arrayList.add(s);
        }

        int n = arrayList.size();
        int m = arrayList.get(0).split("\\s").length;
        String[] splitStringOfArrayList;
        int[][] ints = new int[n][m];

        for (int i = 0; i < n; i++) {
            splitStringOfArrayList = arrayList.get(i).split("\\s");
            for (int j = 0; j < m; j++) {
                ints[i][j] = Integer.parseInt(splitStringOfArrayList[j]);
            }
        }

        int[][] result = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[i][j] = ints[(i - 1 + n) % n][j]
                        + ints[(i + 1) % n][j]
                        + ints[i][(j - 1 + m) % m]
                        + ints[i][(j + 1) % m];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(result[i][j] + (j + 1 == m ? "\n" : " "));
            }
        }
    }
}
