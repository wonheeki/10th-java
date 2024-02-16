package _05_class._02_access_modifier._pack3;

public class B {

    public void method(){
        A a = new A(); // _pack3.A와 _pack3.B는 서로 같은 패키지 (import 없이 사용 가능)

        // 필드 변경
        a.field1 = 11; // O
        a.field2 = 22; // O
        // a.field3 = 33 ;  // X : private field 이기 때문에 compile에러

        // 메서드 호출
        a.method1(); // O
        a.method2(); // O
        // a.method3(); // X : private field 이기 때문에 compile에러
    }

}
