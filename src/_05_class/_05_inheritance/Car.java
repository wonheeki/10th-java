package _05_class._05_inheritance;

public class Car extends Vehicles{
    private boolean convertible;
    public Car(String brand, String model, int year, boolean convertible) {
        super(brand, model, year);
        this.convertible = convertible;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    @Override
    public void behavior(){
        System.out.println("주차했습니다.");
    }
}
