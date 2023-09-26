package hw1.demo1;

import org.omg.PortableServer.POA;

import java.util.ArrayList;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Comment> comments = new ArrayList<>();
        comments.add(new Comment(121,1,"comment", "email@gmail.com", "nothing"));
        comments.add(new Comment(121,2,"comment", "email@gmail.com", "nothing"));
        comments.add(new Comment(121,3,"comment", "email@gmail.com", "nothing"));
        comments.add(new Comment(121,4,"comment", "email@gmail.com", "nothing"));
        comments.add(new Comment(121,5,"comment", "email@gmail.com", "nothing"));

        for (Comment comment : comments) {
            System.out.println("PostId: " + comment.getPostId());
            System.out.println("Id: " + comment.getId());
            System.out.println("Name: " + comment.getName());
            System.out.println("Body: " + comment.getBody());
            System.out.println("Email: " + comment.getEmail());
            System.out.println();

        }


        ArrayList<Post> posts = new ArrayList<>();
        posts.add(new Post(121,1,"title", "body"));
        posts.add(new Post(121,1,"title", "body"));
        posts.add(new Post(121,1,"title", "body"));
        posts.add(new Post(121,1,"title", "body"));
        posts.add(new Post(121,1,"title", "body"));

        for (Post post : posts) {
            System.out.println("UserId: " + post.getUserId());
            System.out.println("Id: " + post.getId());
            System.out.println("Title: " + post.getTitle());
            System.out.println("Body: " + post.getBody());
            System.out.println();

        }

        ArrayList<Book> books = new ArrayList<>();

        ArrayList<String> authors = new ArrayList<>();
        authors.add("John Doe");
        authors.add("Jane Smith");

        books.add(new Book("Book1", 700, authors,"fantasy"));
        books.add(new Book("Book2", 600, authors,"fantasy"));
        books.add(new Book("Book3", 500, authors,"fantasy"));
        books.add(new Book("Book4", 400, authors,"fantasy"));
        books.add(new Book("Book5", 300, authors,"fantasy"));

        for (Book book : books) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Genre: " + book.getGenre());
            System.out.println("Pages: " + book.getPages());
            System.out.println("Authors: " + book.getAuthors());
            System.out.println();
        }

        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("BMW", 700, 2.5,true));
        cars.add(new Car("Mercedes", 600, 4.5,false));
        cars.add(new Car("Porsche", 500, 3.9,true));
        cars.add(new Car("Bugatti", 400, 2.7,true));
        cars.add(new Car("Reno", 300, 4.6,false));

        for (Car car : cars) {
            System.out.println("Model: " + car.getModel());
            System.out.println("Power: " + car.getPower());
            System.out.println("VolumeEngine: " + car.getVolumeEngine());
            System.out.println("isTurbo: " + car.isTurbo());
            System.out.println();
        }

        ArrayList<Dog> dogs = new ArrayList<>();

        dogs.add(new Dog("Jerry", 7, "Bulldog"));
        dogs.add(new Dog("Harry", 6, "Shepard"));
        dogs.add(new Dog("Manny", 5, "Shepard"));
        dogs.add(new Dog("Rex", 4, "Mops"));
        dogs.add(new Dog("Baron", 3, "Bulldog"));

        for (Dog dog : dogs) {
            System.out.println("Name: " + dog.getName());
            System.out.println("Age: " + dog.getAge());
            System.out.println("Bride: " + dog.getBride());
            System.out.println();
        }
    }
}
