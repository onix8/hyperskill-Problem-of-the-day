// Posted from EduTools plugin
// Posted from EduTools plugin

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) throws Exception {
        try (Reader reader = new BufferedReader(new InputStreamReader(System.in))) {
            // start coding here
            ArrayList<Character> list = new ArrayList<>();
            while (reader.ready()) {
                list.add((char) reader.read());
            }
            Collections.reverse(list);
            for (char c : list) {
                System.out.print(c);
            }
        }
    }
}
