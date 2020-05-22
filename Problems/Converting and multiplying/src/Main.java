// Posted from EduTools plugin
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        // put your code here
        ArrayList<String> list = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String s;
            while (true) {
                s = reader.readLine();
                if ("0".equals(s)) {
                    break;
                }

                list.add(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String s : list) {
            try {
                System.out.println(Integer.parseInt(s) * 10);
            } catch (NumberFormatException e) {
                System.out.println("Invalid user input: " + s);
            }
        }
    }
}
