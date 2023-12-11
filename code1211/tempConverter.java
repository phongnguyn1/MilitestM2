import java.util.Scanner;

public class tempConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    convertFahrenheitToCelsius();
                    break;
                case 2:
                    convertCelsiusToFahrenheit();
                    break;

            }
        } while (choice != 0);

        input.close();
    }

    private static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
    }

    private static void convertFahrenheitToCelsius() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Celsius : " + celsius);
    }

    private static void convertCelsiusToFahrenheit() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Celsius temperature: ");
        double celsius = input.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Fahrenheit equivalent: " + fahrenheit);
    }
}
