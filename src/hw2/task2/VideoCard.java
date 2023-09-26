package hw2.task2;

public enum VideoCard {
    AMD("AMD"),
    NVIDIA("NVIDIA");

    private final String brand;

    VideoCard(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "VideoCard{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
