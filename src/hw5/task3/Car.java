package hw5.task3;

public class Car {
    private String brand;
    private int enginePower;
    private Driver owner;
    private double price;
    private int yearProd;

    public Car() {
    }

    public Car(String brand, int enginePower, Driver owner, double price, int yearProd) {
        this.brand = brand;
        this.enginePower = enginePower;
        this.owner = owner;
        this.price = price;
        this.yearProd = yearProd;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public Driver getOwner() {
        return owner;
    }

    public void setOwner(Driver owner) {
        this.owner = owner;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYearProd() {
        return yearProd;
    }

    public void setYearProd(int yearProd) {
        this.yearProd = yearProd;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", enginePower='" + enginePower + '\'' +
                ", owner=" + owner +
                ", price=" + price +
                ", yearProd=" + yearProd +
                '}';
    }
}
