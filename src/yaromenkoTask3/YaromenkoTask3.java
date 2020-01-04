package yaromenkoTask3;

import java.util.Scanner;

public class YaromenkoTask3 {

    public static void main(String[] args) {
        int length = getLengthOfArray();
        double[] arrayOfNumbers = getElementsOfArray(length);
        searchElementsOfArray(arrayOfNumbers);
    }

    private static int getLengthOfArray() {
        int length;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter a length of array: ");
        do {
            while (!sc.hasNextInt()) {
                System.out.println("Invalid value entered. Please, try again:");
                sc.next();
            }
            length = sc.nextInt();
            if (length <= 0) {
                System.out.println("You must enter a positive number. Please, try again:");
            }
        } while (length <= 0);
        return length;
    }

    private static double[] getElementsOfArray(int length) {
        double[] arrayOfNumbers = new double[length];
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter elements of array: ");
        for (int i = 0; i < length; i++) {
            while (!sc.hasNextDouble()) {
                System.out.println("Invalid value entered. Please, try again:");
                sc.next();
            }
            arrayOfNumbers[i] = sc.nextDouble();
        }
        return arrayOfNumbers;
    }

    private static void searchElementsOfArray(double[] arrayOfNumbers) {
        for (double arrayOfNumber : arrayOfNumbers) {
            if (arrayOfNumber % 3 == 0) {
                System.out.print(arrayOfNumber + "  ");
            }
        }
    }
}
