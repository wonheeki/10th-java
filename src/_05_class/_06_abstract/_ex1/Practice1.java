package _05_class._06_abstract._ex1;

import _05_class._06_abstract._ex1.Baek;
import _05_class._06_abstract._ex1.Kim;

public class Practice1 {
    public static void main(String[] args) {
        Kim kim = new Kim("김철수",17, "ABC 고등학교", 2022001);
        System.out.println("===="+kim.getName()+" 학생의 정보 ====");
        System.out.println("학교 : "+kim.getSchool());
        System.out.println("나이 : "+kim.getAge());
        System.out.println("학번 : "+kim.getNum());
        kim.todo();
        System.out.println();
        Baek baek = new Baek("백영희", 18,"XYZ 고등학교", 2022002);
        System.out.println("===="+baek.getName()+" 학생의 정보 ====");
        System.out.println("학교 : "+baek.getSchool());
        System.out.println("나이 : "+baek.getAge());
        System.out.println("학번 : "+baek.getNum());
        baek.todo();

    }
}
