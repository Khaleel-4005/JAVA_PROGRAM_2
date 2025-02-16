class Calculator1 {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Calculator1 calc = new Calculator1();
        System.out.println("Addition of integers: " + calc.add(15, 100));
        System.out.println("Addition of doubles: " + calc.add(5.5, 10.5));
    }
}
