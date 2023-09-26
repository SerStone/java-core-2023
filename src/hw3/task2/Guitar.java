package hw3.task2;

public class Guitar implements Instrument {

    private Type type;
    private int numOfStrings;

    public Guitar() {
    }

    public Guitar(Type type, int numOfStrings) {
        this.type = type;
        this.numOfStrings = numOfStrings;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }

    public void setNumOfStrings(int numOfStrings) {
        this.numOfStrings = numOfStrings;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "type=" + type +
                ", numOfStrings=" + numOfStrings +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Plays a " + type + " with a " + "numOfStrings: " + numOfStrings + " characteristic.");
    }
}
