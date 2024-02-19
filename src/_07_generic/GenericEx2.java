package _07_generic;

// 참고, Number 클래스
// - Java에서 모든 숫자 형식의 부모 클래스
// - 정수형, 실수형 데이터 타입 모두 포함
// ex. Byte, Short, Integer 등 등

// 제네릭 제한 Case 1
// - Box 클래스는 제네릭 타입 T를 받지만 제한을 두어 Number를 상속한 클래스만 허용
class Box<T extends Number>{
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

// 제네릭 제한
// Movable 인터페이스
interface Movable{
    void move();
}

// Movable 인터페이스를 구현하는 Car 클래스
class Car implements  Movable{
    @Override
    public void move(){
        System.out.println("자동차 출발");
    }
}

// Case 2
// Container 클래스는 제네릭 타입 T를 받지만 제한을 두어 Movable 인터페이스를 구현한 클래스만 허용
// - makeItMove 메서드는 해당 객체의 move 메서드를 호출
class Container<T extends Movable>{
    private T item;

    public Container(T item) {
        this.item = item;
    }

    public void makeItMove(){
        item.move();
    }
}

public class GenericEx2 {
    public static void main(String[] args) {
        Box<Double> doubleBox = new Box<>();
        doubleBox.setItem(3.14);
        System.out.println(doubleBox.getItem());

        // x : 제네릭 타입에 Number를 상속받지 않는 타입을 사용
        // Box<String> stringBox = new Box<String>();
        // StringBuffer.setItem("hello World");

        /////////////////////////////////////////////
        // 생성자에 매개변수가 있기 때문에
        Container<Car> carContainer = new Container<>(new Car());
        carContainer.makeItMove();

    }
}
