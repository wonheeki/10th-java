package _05_class._06_abstract;

// 구체적인 클래스
public class Square extends Shape {

    public Square(String color) {

        super(color);
    }

    // 추상메서드 구현
    @Override
    void draw() {
        System.out.println("사각형 그리기!");
    }


}
