package _05_class._07_interface._ex2;

import java.util.ArrayList;

public class VehicleEx {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicle = new ArrayList<>();
        Car car = new Car("소나타",130);
        Airplane airplane = new Airplane("아시아나",700 );
        vehicle.add(car);
        vehicle.add(airplane);

        for(Vehicle v:vehicle){
            System.out.println(v.getName()+"의 최고 속력은 "+v.getMaxSpeed());
            v.move();
        }
        airplane.fly();
    }
}
