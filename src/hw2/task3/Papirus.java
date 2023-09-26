package hw2.task3;

public class Papirus {
    Status status;
    private String name;

    public Papirus() {
    }


    public Papirus(Status status, String name) {
        this.status = status;
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Papirus{" +
                "status=" + status +
                ", name='" + name +
                '}'+ super.toString();
    }
}
