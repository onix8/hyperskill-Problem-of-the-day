// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 1) System.out.println("no army");
            else if (n < 5) System.out.println("few");
                else if (n < 10) System.out.println("several");
                    else if (n < 20) System.out.println("pack");
                        else if (n < 50) System.out.println("lots");
                            else if (n < 100) System.out.println("horde");
                                else if (n < 250) System.out.println("throng");
                                    else if (n < 500) System.out.println("swarm");
                                        else if (n < 1000) System.out.println("zounds");
                                            else System.out.println("legion");
    }
}