import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        String s = new Scanner(System.in).nextLine();
        if (s.length() == 1) {
            System.out.println(s + 1);
        } else {
            if (s.length() != 0) {
                for (int i = 0; i <= s.length() - 1; i++) {
                    if (i == s.length() - 1) {
                        System.out.print(s.charAt(s.length() - 1) + "1");
                        break;
                    } else {
                        System.out.print(s.charAt(i));
                        int j = i;
                        while (j <= s.length() - 1) {
                            if (j == s.length() - 1) {
                                System.out.print((j - i) + 1);
                                i += j - i;
                                break;
                            }
                            if (s.charAt(j) == s.charAt(j + 1)) {
                                j++;
                            } else {
                                if (j == i) {
                                    System.out.print("1");
                                } else {
                                    System.out.print((j - i) + 1);
                                }
                                i += j - i;
                                break;
                            }
                        }
                        if (i == s.length() - 1) {
                            break;
                        }
                    }
                }
            }

        }
    }
}