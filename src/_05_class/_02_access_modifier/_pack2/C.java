package _05_class._02_access_modifier._pack2;

import _05_class._02_access_modifier._pack1.B;

public class C {
    // A a; // X default 이기 때문에 다른 패키지에서 접근 불가
    B b; // O
    
    // C 클래스는 A, B 클래스와 패키지가 다르므로 
    // default 제한자인 A 클래스는 에러 발생
    // public 제한자인 B 클래스는 가능
}
