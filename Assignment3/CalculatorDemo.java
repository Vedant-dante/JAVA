package Assignment3;

class Calculator {

    static int calculationCount = 0;

    int add(int a, int b) {
        calculationCount++;
        return a + b;
    }

    double add(double a, double b) {
        calculationCount++;
        return a + b;
    }

    static void showCount() {
        System.out.println("Total Calculations = " + calculationCount);
    }
}

public class CalculatorDemo {

    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Addition of Integers = " + c.add(20, 15));
        System.out.println("Addition of Decimals = " + c.add(12.5, 8.7));

        Calculator.showCount();
    }
}