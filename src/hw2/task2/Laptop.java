package hw2.task2;

public class Laptop extends PC {
    private int weight;

    public Laptop() {

    }

    public Laptop(String brand, int RAM, int storage, boolean coolerboast, int weight){
        super(brand, RAM, storage, coolerboast);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "weight=" + weight +
                '}' + super.toString();
    }
}
