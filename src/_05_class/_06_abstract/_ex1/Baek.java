package _05_class._06_abstract._ex1;

public class Baek extends Student{

    public Baek(String name,int age, String school, int num) {
        super(name, age, school,num);
    }

    @Override
    public void todo() {
        System.out.println("점심은 백종원 피자");
    }
}
