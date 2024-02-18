import java.util.Scanner;

class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius;

        while (true) {
            System.out.print("Enter temperature in Celsius: ");
            if (scanner.hasNextDouble()) {
                celsius = scanner.nextDouble();
                double fahrenheit = celsiusToFahrenheit(celsius);
                System.out.printf("The temperature %.2f°C is equal to %.2f°F.\n", celsius, fahrenheit);
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid number for temperature.");
                scanner.next();
            }
        }

        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
