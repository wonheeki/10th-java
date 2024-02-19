package _07_generic._ex2;

public class Calculator<T> {
    private T num1;
    private T num2;

    public Calculator(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add(){
        return 0.0;
//        return (num1.doubleValue()+num2.doubleValue());
    }
}
