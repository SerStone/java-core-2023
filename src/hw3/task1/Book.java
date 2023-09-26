package hw3.task1;



public class Book implements Printable {
    private String name;
    private String genre;
    private int pages;

    public Book() {
    }

    public Book(String name, String genre, int pages) {
        this.name = name;
        this.genre = genre;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
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
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", pages=" + pages +
                '}';
    }

    @Override
    public void print() {
        System.out.println("name: " + name);
    }
}
