// Posted from EduTools plugin
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Character> list = new ArrayList<>();
        String s = "";
        try (Reader reader = new BufferedReader(new InputStreamReader(System.in))) {
            // start coding here
            do {
                list.add((char) reader.read());
            } while (reader.ready());
        }
        for (char c : list) {
            s = s.concat(String.valueOf(c));
        }
        Scanner sc = new Scanner(s);
        int n = 0;
        while (sc.hasNext()) {
            sc.next();
            n++;
        }
        System.out.println(n);
    }
}