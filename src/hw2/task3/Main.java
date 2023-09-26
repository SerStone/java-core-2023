package hw2.task3;

public class Main {
    public static void main(String[] args) {
        Papirus papirus = new Papirus(Status.OLD, "Rise of the Rome Empire.");
        System.out.println(papirus);

        Book book = new Book(Status.NEW, "Rise of the Rome Empire.", 340);
        System.out.println(book);

        Magazine magazine = new Magazine(Status.NEW, "Rise of the Rome Empire.", 340, Type.VIP, 0.8);
        System.out.println(magazine);

        Comics comics = new Comics(Status.NEW, "Rise of the Rome Empire.", 340, "history" ,Type.PREMIUM);
        System.out.println(comics);

    }
}
