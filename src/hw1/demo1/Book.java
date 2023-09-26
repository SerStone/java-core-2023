package hw1.demo1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Book {

  private String title;
  private int pages;
  private ArrayList<String> Authors;
  private String genre;

  public Book (String title, int pages, ArrayList<String> Authors, String genre) {

      this.title = title;
      this.pages = pages;
      this.Authors = Authors;
      this.genre = genre;
  }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public ArrayList<String> getAuthors() {
        return Authors;
    }

    public void setAuthors(ArrayList<String> authors) {
        Authors = authors;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
