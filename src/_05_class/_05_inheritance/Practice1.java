package _05_class._05_inheritance;

public class Practice1 {
    public static void main(String[] args) {

        Dog d = new Dog("하이",1);
        System.out.println("내가 키우는 건 " + d.getSpecies()+". 이름은 "+ d.getName()+"이고 나이는 "+ d.getAge()+"이다.");
        d.makeSound();

        Cat c = new Cat("치즈",14);
        System.out.println("내가 키우는 건 " + c.getSpecies()+". 이름은 "+ c.getName()+"이고 나이는 "+ c.getAge()+"이다.");
        d.makeSound();
        c.makeSound();

        Bus bus = new Bus("Hyundai","City Bus",2022,30);
        System.out.println("==== Bus 정보 ====");
        System.out.println("Bus"+bus.toString()+" ,passengerCapacity = "+bus.getPassengerCapactity()+"}");
        bus.run();
        bus.behavior();
        bus.stop();
        System.out.println();

        Car car = new Car("Toyota","Camry",2023,true);
        System.out.println("==== Car 정보 ====");
        System.out.println("Car"+car.toString()+" ,convertible = "+car.isConvertible()+"}");
        car.run();
        car.behavior();
        car.stop();
        System.out.println();

        Motocycle motocycle = new Motocycle("Harley-Davidson","Sportster",2021,"A");
        System.out.println("==== Motocycle 정보 ====");
        System.out.println("Motocycle"+motocycle.toString()+" ,licensetype = "+motocycle.getLicenseType()+"}");
        motocycle.run();
        motocycle.behavior();
        motocycle.stop();


    }
}
