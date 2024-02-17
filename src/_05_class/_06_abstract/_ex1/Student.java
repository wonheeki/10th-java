package _05_class._06_abstract._ex1;

abstract public class Student {
    private String name;

    private int age;
    private String school;
    private int num;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSchool() {
        return school;
    }

    public int getNum() {
        return num;
    }

    public Student(String name, int age, String school, int num) {
        this.name = name;
        this.age = age;
        this.school = school;
        this.num = num;
    }

    abstract void todo();
}
