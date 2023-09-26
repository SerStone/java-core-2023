package hw2.task2;

public class PC {
    private String brand;
    private int RAM;
    private int storage;
    private boolean coolerBoast;

    public PC() {

    }

    public PC(String brand, int RAM, int storage, boolean coolerBoast) {
        this.brand = brand;
        this.RAM = RAM;
        this.storage = storage;
        this.coolerBoast = coolerBoast;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return RAM;
    }

    public void setRam(int RAM) {
        this.RAM = RAM;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public boolean isCoolerBoast() {
        return coolerBoast;
    }

    public void setCoolerBoast(boolean coolerBoast) {
        this.coolerBoast = coolerBoast;
    }

    @Override
    public String toString() {
        return "PC{" +
                "brand='" + brand + '\'' +
                ", RAM=" + RAM +
                ", storage=" + storage +
                ", coolerBoast=" + coolerBoast +
                '}';
    }
}
