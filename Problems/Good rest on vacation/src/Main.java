// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int durationInDays = scanner.nextInt();
        int foodCost = scanner.nextInt() * durationInDays;
        int flightCost = scanner.nextInt() * 2;
        int costHotel = scanner.nextInt() * (durationInDays - 1);
        int costVacation = foodCost + flightCost + costHotel;
        System.out.println(costVacation);
    }
}
