package _05_class._05_inheritance;

public class Motocycle extends Vehicles{
    private String licenseType;

    public Motocycle(String brand, String model, int year,String licenseType) {
        super(brand, model, year);
        this.licenseType =licenseType;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    @Override
    public void behavior(){
        System.out.println("울림통을 합니다.");
    }
}
