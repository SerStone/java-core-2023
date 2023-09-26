package hw2.task4;

public class Main {
    public static void main(String[] args) {
        User user = new User(1, "vasya", "pupkin", "asd@asd.com", 31, Gender.MALE, new Car("toyota", 2023, 323));

        user.getSkills().add(new Skill("js",8));
        System.out.println(user);
    }
}
