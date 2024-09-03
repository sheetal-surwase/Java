import java.util.Scanner;

public class TemperatureConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                convertCelsius(celsius);
                break;
            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                convertFahrenheit(fahrenheit);
                break;
            
            default:
                System.out.println("Invalid choice");
        }
    }

    public static void convertCelsius(double celsius) {
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.printf("%.2f°C is equal to %.2f°F %n", celsius, fahrenheit);
    }

    public static void convertFahrenheit(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.printf("%.2f°F is equal to %.2f°C %n", fahrenheit, celsius);
    }

}