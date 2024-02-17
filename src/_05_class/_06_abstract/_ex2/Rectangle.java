package _05_class._06_abstract._ex2;

// 구체적인 클래스
public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {

        super(color,"Rectangle");
        this.width = width;
        this.height = height;
    }

    // 추상메서드 구현
    @Override
    void draw() {
        System.out.println("사각형 그리기!");
    }

    @Override
    double calculateArea() {
        return width*height;
    }
}
