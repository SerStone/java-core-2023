package hw3.task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("one","two",400);
        Magazine magazine = new Magazine("one",TYPE.NEW,400);

        ArrayList<Printable> printables = new ArrayList<>();
        printables.add(book);
        printables.add(magazine);

        for (Printable printable : printables) {
            printable.print();
            System.out.println(printable);
        }

    }
}
