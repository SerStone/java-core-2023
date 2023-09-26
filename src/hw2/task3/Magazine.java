package hw2.task3;

public class Magazine extends Book {
    Type type;
    private double thickness;

    public Magazine() {
    }

    public Magazine(Status status, String name, int pages, Type type, double thickness) {
        super(status, name, pages);
        this.type = type;
        this.thickness = thickness;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "type=" + type +
                ", thickness=" + thickness +
                '}'+ super.toString();
    }
}
