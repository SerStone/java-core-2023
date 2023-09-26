package hw3.task1;

public class Magazine implements Printable {
    private String name;
    private TYPE type;
    private int pages;

    public Magazine() {
    }

    public Magazine(String name, TYPE type, int pages) {
        this.name = name;
        this.type = type;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", pages=" + pages +
                '}';
    }

    @Override
    public void print() {
        System.out.println("type: " + type);
    }
}
