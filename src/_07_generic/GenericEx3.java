package _07_generic;

// 사람 객체간 상속 관계
// Person
// ㄴ Teacher
// ㄴ Student
//   ㄴ WebStudent
//   ㄴ MobileStudent

class  Person{}
class Student extends Person {}
class Teacher extends Person{}
class WebStudent extends Student{}
class MobileStudent extends Student{}

// 등록
// - 특정 종류 (T)의 Applicant를 나타내는 클래스
class Applicant<T>{
    public T kind;

    public Applicant(T kind) {
        this.kind = kind;
    }
}

// 과정
class Course{
    // 모든 사람이 등록 가능
    public static void registierCourseA(Applicant<?> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName()+"이(가) Course A를 등록함");
    }

    // Student 객체만 등록 가능
    public static void registierCourseB(Applicant<? extends Student> applicant ){
        System.out.println(applicant.kind.getClass().getSimpleName()+"이(가) Course B를 등록함");
    }
    // Teacher 가능, Student가 아닌 Person만 등록가능
    public static void registierCourseC(Applicant<? super Teacher> applicant ){
        System.out.println(applicant.kind.getClass().getSimpleName()+"이(가) Course B를 등록함");
    }
    // 참고, getClass(), getSimpleName() 메소드
    // - Object 클래스에서 제공되는 메서드
    // - getClass() : 객체 클래스 정보 반환, 반환 값은 클래스 객체(ex, class.java.lang.String)
    // - getSimpleName(): Class 클래스의 메서드 클래스의 간결한 이름 반환, 패키지 정보 제외한 클래스 이름만 얻어올 때 사용
}


public class GenericEx3 {
    public static void main(String[] args) {
        // Course A 모든 사람이 신청 가능
        Course.registierCourseA(new Applicant<Person>(new Person()));
        Course.registierCourseA(new Applicant<Teacher>(new Teacher()));
        Course.registierCourseA(new Applicant<Student>(new Student()));
        Course.registierCourseA(new Applicant<WebStudent>(new WebStudent()));
        Course.registierCourseA(new Applicant<MobileStudent>(new MobileStudent()));

        // course B Student만 등록 가능 (Student의 서브 클래스도 가능)
        // Course.registierCourseB(new Applicant<Person>(new Person())); // X
        // Course.registierCourseB(new Applicant<Teacher>(new Teacher())); // X
        Course.registierCourseB(new Applicant<Student>(new Student()));
        Course.registierCourseB(new Applicant<WebStudent>(new WebStudent()));
        Course.registierCourseB(new Applicant<MobileStudent>(new MobileStudent()));

        // Course C 는 Teacher / Student가 아닌 Person 만 등록가능
        Course.registierCourseC(new Applicant<Person>(new Person()));
        Course.registierCourseC(new Applicant<Teacher>(new Teacher()));
        // Course.registierCourseC(new Applicant<Student>(new Student())); // X
        // Course.registierCourseC(new Applicant<WebStudent>(new WebStudent())); // X
        //  Course.registierCourseC(new Applicant<MobileStudent>(new MobileStudent())); // X

    }
}
