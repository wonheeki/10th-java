package _05_class._02_access_modifier._pack5;

public class PersonEx {
    public static void main(String[] args) {
        // 객체 생성
        Person p1 = new Person("minion");
        Person p2 = new Person("pooh");

        // p1.age = 4; // X : 필드를 직접 변경하는 것은 불가능
        p1.setAge(4); // O : 메서드를 이용한 간접적 변경
        System.out.println(p1.getName()+"의 나이 : " +p1.getAge());

        p2.setAge(-6); // 나이 값이 음수인 경우, setAge 내부로직에 의해 0으로 변경
        System.out.println(p2.getName()+"의 나이 : " +p2.getAge());

    }
}
