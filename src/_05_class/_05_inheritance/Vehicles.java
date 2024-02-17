package _05_class._05_inheritance;

public class Vehicles {
    private String brand;
    private String model;
    private int year;


    public Vehicles(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }



    public void run(){
        System.out.println("차량 시동을 걸었습니다.");
    }

    public void behavior(){
        System.out.println("운행중");
    }

    public void stop(){
        System.out.println("차량을 정지했습니다.");
    }

    public String toString(){
        return "{brand= \'"+brand+"\', model = \'"+model+"\' ,year = "+year;
    }
}
