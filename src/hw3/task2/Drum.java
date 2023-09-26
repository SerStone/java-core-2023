package hw3.task2;

public class Drum implements Instrument {

    private Type type;
    private int size;

    public Drum() {
    }

    public Drum(Type type, int size) {
        this.type = type;
        this.size = size;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Drum{" +
                "type=" + type +
                ", size=" + size +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Plays a " + type + " with a " + "size: " + size + " cm " + " characteristic.");
    }
}
