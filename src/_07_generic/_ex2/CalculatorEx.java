package _07_generic._ex2;

public class CalculatorEx {
    public static void main(String[] args) {
        Calculator<Integer> c1 = new Calculator<>(10,5);
        System.out.println("Integer Sum"+c1.add());

        Calculator<Double> c2 = new Calculator<>(5.23424,1.34342);
        System.out.println("Double Sum"+c2.add());
    }
}
