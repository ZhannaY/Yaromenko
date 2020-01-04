package yaromenkoTask2;

import java.util.Scanner;

public class YaromenkoTask2 {

    public static void main(String[] args) {
        checkName();
    }
    private static void checkName() {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter a name: ");
        name = sc.nextLine();
        if (name.equals("Вячеслав")) {
            System.out.print("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
        sc.close();
    }
}