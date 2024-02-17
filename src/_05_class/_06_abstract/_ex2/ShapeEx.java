package _05_class._06_abstract._ex2;

import java.util.ArrayList;

public class ShapeEx {
    public static void main(String[] args) {
        // Shape 객체는 new 연산자로 직접 생성할 수 없지만,
        // 자식 클래스인 Circle, Square에서 new 연산자로 객체 생성 가능

        // Shape -> Circle, Rectangle의 부모이기 때문에
        // 자바의 다형성 - 하나의 변수가 여러 종류의 객체를 참조할 수 있는 능력
        ArrayList<Shape> shape = new ArrayList<>();
        shape.add(new Circle("blue",6));
        shape.add(new Rectangle("red",3,5));

        for(Shape s : shape){
            System.out.println("====="+s.getType()+"도형의 정보====");
            System.out.println("도형의 색상 : "+s.getColor());
            System.out.println("도형의 넓이 : "+s.calculateArea());
            System.out.println();
        }
    }
}
