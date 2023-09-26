package hw2.task3;

public class Book extends Papirus {
    private int pages;

    public Book() {
    }

    public Book(Status status, String name, int pages) {
        super(status, name);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "pages=" + pages +
                '}' + super.toString();
    }
}
