package hw2.task2;

public class Ultrabook extends Laptop {
    private boolean touchScreen;

    public Ultrabook() {
    }

    public Ultrabook(String brand, int RAM, int storage, boolean coolerboast, int weight, boolean touchScreen) {
        super(brand, RAM, storage, coolerboast, weight);
        this.touchScreen = touchScreen;
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    @Override
    public String toString() {
        return "Ultrabook{" +
                "touchScreen=" + touchScreen +
                '}' + super.toString();
    }
}
