# Products_Output

This project demonstrates basic Java programming concepts such as string manipulation, formatted output, and locale configuration. It is designed to generate a formatted display of product information, personal records, and numerical values.

## Features

- **Product Information**: Displays the names and prices of two products, formatted with two decimal places.
- **Personal Records**: Outputs a personal record containing age, identification code, and gender.
- **Measurements**: Demonstrates handling of floating-point numbers with different levels of precision and locale-specific formatting.

## Code Overview

The main functionality is divided into the following sections:

1. **Variable Declarations**:
    - Stores product names, personal information (age, code, gender), and numerical values (prices and a measurement).

2. **Formatted Output**:
    - Outputs strings and numerical values using `System.out.printf` for formatted display.
    - Demonstrates the use of format specifiers such as `%s`, `%d`, `%f`, and `%.2f`.

3. **Locale Configuration**:
    - Changes the default locale to `Locale.US` to use a dot as the decimal separator, ensuring consistent formatting for international audiences.

## Example Output

```
Products:
Computer, which price is $ 2100.00
Office desk, which price is $ 650.50

Record: 30 years old, code 5290 and gender: F

Measure with decimal places: 53.234567
Rounded (three decimal places): 53.235
US decimal point: 53.235
```

## How to Run

1. Clone this repository:
   ```bash
   git clone <repository-url>
   ```
2. Compile the Java program:
   ```bash
   javac Main.java
   ```
3. Run the program:
   ```bash
   java Main
   ```

## Learning Objectives

- Understand how to format output in Java.
- Learn how to work with floating-point precision.
- Explore the use of locales for formatting numeric values.

## Potential Improvements

- Add user input functionality to make the program interactive.
- Include error handling for invalid input.
- Extend the program to support more products or records dynamically.

## Author
Developed by Otavio as part of learning and showcasing Java programming skills.


