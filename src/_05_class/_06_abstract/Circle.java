package _05_class._06_abstract;

// 구체적인 클래스
public class Circle extends Shape {
    public Circle(String color) {
        super(color);
    }

    // 추상메서드 구현

    // 만약 Circle이 추상 클래스라면 draw를 여기서 오버라이딩하지 않고
    // Circle을 상속받는 클래스에서 구현해주면 된다.
    @Override
    void draw() {
        System.out.println("원 그리기!");
    }


}
