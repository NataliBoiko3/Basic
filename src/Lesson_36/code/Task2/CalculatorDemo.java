package Lesson_36.code.Task2;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Примеры использования методов калькулятора
        System.out.println("Integer operations:");
        System.out.println("1 + 2 = " + calc.add(1, 2));        // 3.0
        System.out.println("5 - 3 = " + calc.subtract(5, 3));   // 2.0
        System.out.println("4 * 3 = " + calc.multiply(4, 3));   // 12.0
        System.out.println("10 / 2 = " + calc.divide(10, 2));   // 5.0

        System.out.println("\nFloat operations:");
        System.out.println("1.5 + 2.3 = " + calc.add(1.5f, 2.3f));    // 3.8
        System.out.println("5.5 - 3.2 = " + calc.subtract(5.5f, 3.2f)); // 2.3
        System.out.println("4.5 * 3.2 = " + calc.multiply(4.5f, 3.2f)); // 14.4
        System.out.println("10.0 / 2.0 = " + calc.divide(10.0f, 2.0f));  // 5.0

        System.out.println("\nDouble operations:");
        System.out.println("1.5 + 2.3 = " + calc.add(1.5, 2.3));    // 3.8
        System.out.println("5.5 - 3.2 = " + calc.subtract(5.5, 3.2)); // 2.3
        System.out.println("4.5 * 3.2 = " + calc.multiply(4.5, 3.2)); // 14.4
        System.out.println("10.0 / 2.0 = " + calc.divide(10.0, 2.0));  // 5.0
    }
}


