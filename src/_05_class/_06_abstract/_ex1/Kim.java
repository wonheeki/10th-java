package _05_class._06_abstract._ex1;

public class Kim extends Student{

    public Kim(String name, int age,String school, int num) {
        super(name,age, school,num);
    }

    @Override
    public void todo() {
        System.out.println("점심은 김가네 김밥");
    }
}
