package hw2.task2;

public class Main {
    public static void main(String[] args) {
        PC pc = new PC("Asus", 16, 512, false);
        System.out.println(pc);

        Laptop laptop = new Laptop("Acer", 16, 512, false,12);
        System.out.println(laptop);

        Ultrabook ultrabook = new Ultrabook("HP", 16, 512, false,12,true);
        System.out.println(ultrabook);

        Workstation workstation = new Workstation("Apple", 16, 512, false,12, VideoCard.AMD);
        System.out.println(workstation);

    }
}
