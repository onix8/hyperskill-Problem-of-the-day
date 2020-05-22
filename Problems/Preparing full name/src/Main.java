// Posted from EduTools plugin
import java.util.Scanner;

public class Main {

    public static String prepareFullName(String firstName, String lastName) {
        // write your code here
        String result = "";
        if (firstName != null) result = firstName;
        if (result.equals(firstName) && lastName != null) {
            return result + " " + lastName;
        } else {
            if (result.isEmpty() && lastName != null) {
                return lastName;
            }
        }
        return result;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        firstName = "null".equals(firstName) ? null : firstName;

        String lastName = scanner.nextLine();
        lastName = "null".equals(lastName) ? null : lastName;

        System.out.println(prepareFullName(firstName, lastName));
    }
}