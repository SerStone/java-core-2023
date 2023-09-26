package hw3.task2;

public class Trumpet implements Instrument {

    private Type type;
    private double diameter;

    public Trumpet() {
    }

    public Trumpet(Type type, double diameter) {
        this.type = type;
        this.diameter = diameter;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Trumpet{" +
                "type=" + type +
                ", diameter=" + diameter +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Plays a " + type + " with a " + "diameter: " + diameter + " cm " + " characteristic.");
    }
}
