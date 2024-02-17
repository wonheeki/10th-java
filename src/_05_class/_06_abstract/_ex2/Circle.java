package _05_class._06_abstract._ex2;

// 구체적인 클래스
public class Circle extends Shape {
    private int radius;
    public Circle(String color,int radius) {
        super(color,"Circle");
        this.radius= radius;
    }

    // 추상메서드 구현
    @Override
    void draw() {
        System.out.println("원 그리기!");
    }

    @Override
    double calculateArea() {
        return radius*radius*Math.PI;
    }
}
