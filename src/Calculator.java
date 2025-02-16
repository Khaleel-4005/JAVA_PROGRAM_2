public class Calculator {

    int add(int a, int b){
    return a+b;

    }
    double add(double a, double b){
        return a+b;
    }

    //public class polymorphismExample{
    public static void main(String[] args){
        Calculator calc = new Calculator();

        System.out.println("Addition of two integer: " + calc.add(5 ,10));
        System.out.println("double of two double: "+ calc.add(5.5 , 10.5));
    }

    //}
}
