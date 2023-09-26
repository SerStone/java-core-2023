package hw2.task3;

public enum Type {
    VIP("VIP"),
    PREMIUM("PREMIUM"),
    STANDARD("STANDARD");

    private final String type;

    Type(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Type{" +
                "type='" + type + '\'' +
                '}'+ super.toString();
    }
}
