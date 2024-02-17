package _05_class._05_inheritance;

public class Bus extends Vehicles{
    private int passengerCapactity;

    public Bus(String brand, String model, int year, int passengerCapacity) {
        super(brand, model, year);
        this.passengerCapactity = passengerCapacity;
    }

    public int getPassengerCapactity() {
        return passengerCapactity;
    }

    public void setPassengerCapactity(int passengerCapactity) {
        this.passengerCapactity = passengerCapactity;
    }

    @Override
    public void behavior(){
        System.out.println("승객을 운송합니다.");
    }
}
