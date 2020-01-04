package yaromenkoTask1;

import java.util.Scanner;

public class YaromenkoTask1 {

    public static void main(String[] args) {
        double number = getNumber();
        checkNumber(number);
    }
    private static double getNumber() {
        Scanner sc = new Scanner(System.in);
        double number;
        System.out.print("Please, enter a number: ");
        while (!sc.hasNextDouble()) {
            System.out.println("This is not a number. Please, try again:");
            sc.next();
        }
        number = sc.nextDouble();
        sc.close();
        return number;
    }

    private static void checkNumber(double number) {
        if (number > 7) {
            System.out.println("Привет");
        }
    }
}
