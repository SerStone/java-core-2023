package hw2.task3;

public enum Status {
    NEW("NEW"),
    OLD("OLD");

    private final String status;
    Status (String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Status{" +
                "status='" + status + '\'' +
                '}'+ super.toString();
    }
}
