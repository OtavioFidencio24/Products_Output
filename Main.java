import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Declaration of variables to store product names
        String product1 = "Computer";
        String product2 = "Office desk";

        // Declaration of variables to store personal information
        int age = 30; // Person's age
        int code = 5290; // Identification code
        char gender = 'F'; // Person's gender

        // Declaration of variables to store prices and measurements
        double price1 = 2100.0; // Price of the first product
        double price2 = 650.50; // Price of the second product
        double measure = 53.234567; // Measurement with decimal places

        // Displaying products with their formatted prices
        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f%n", product1, price1); // Displays the name and price of product 1
        System.out.printf("%s, which price is $ %.2f %n", product2, price2); // Displays the name and price of product 2

        // Displaying formatted personal information
        System.out.printf("%nRecord: %d years old, code %d and gender: %c%n", age, code, gender);

        // Displaying measurements in different formats
        System.out.printf("%nMeasure with decimal places: %f%n", measure); // Displays the measurement in the default floating-point format
        System.out.printf("Rounded (three decimal places): %.3f%n", measure); // Displays the measurement rounded to three decimal places

        // Sets the numeric format to the US standard (dot as the decimal separator)
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", measure); // Displays the measurement with the US decimal separator

    }
}