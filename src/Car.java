public class Car {
    private static String vin;
    private String brand;
    private String model;
    private int year;
    private String licensePlate;
    private Customer owner;

    public Car(final String vin, String brand, String model, int year, String licensePlate,Customer owner ){
        this.vin = vin;
        this.brand = brand;
        this.model = model;
        if(year>0){
            this.year = year;
        }else{
            System.out.println("Enter a valid year");
        }
        this.licensePlate = licensePlate;
        this.owner = owner;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    public String getBrand() {
        return brand;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public String getLicensePlate(){
        return licensePlate;
    }
    public Customer getOwner(){
        return owner;
    }

    @Override
    public String toString(){
        return "Brand: " + brand + ", Model: " + model + ", Year: " + year + ", License: " + licensePlate + " "  + owner;
    }
}
