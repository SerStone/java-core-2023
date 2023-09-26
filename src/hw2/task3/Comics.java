package hw2.task3;

public class Comics extends Book{
    private String genre;
    Type type;

    public Comics() {
    }

    public Comics(Status status, String name, int pages, String genre, Type type) {
        super(status, name, pages);
        this.genre = genre;
        this.type = type;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Comics{" +
                "genre='" + genre + '\'' +
                ", type=" + type +
                '}' + super.toString();
    }
}
