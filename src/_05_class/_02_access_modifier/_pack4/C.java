package _05_class._02_access_modifier._pack4;

import _05_class._02_access_modifier._pack3.A;

public class C {
        public void method(){
            A a = new A(); // _pack3.A와 _pack4.C는 서로 다른 패키지 (import 필요)

            // 필드 변경
            a.field1 = 11; // O
            // a.field2 = 22; // X : default field이기 때문에 compile에러
            // a.field3 = 33 ;  // X : private field 이기 때문에 compile에러

            // 메서드 호출
            a.method1(); // O
            // a.method2(); // X : default field이기 때문에 compile에러
            // a.method3(); // X : private field 이기 때문에 compile에러
        }


}
