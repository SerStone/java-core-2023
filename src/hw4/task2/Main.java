package hw4.task2;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "Pedro", "bgb", "asd@asd.com", 51, Gender.MALE,
                new Car("toyota", 2023, 323));
        user1.getSkills().add(new Skill("js",8));
        user1.getSkills().add(new Skill("java",80));
        user1.getSkills().add(new Skill("python",180));
        User user2 = new User(2, "Jenny", "gbg", "asd@asd.com", 21, Gender.FEMALE,
                new Car("toyota", 2023, 323));
        user2.getSkills().add(new Skill("js",8));
        user2.getSkills().add(new Skill("java",80));
        User user3 = new User(3, "Peter", "bgb", "asd@asd.com", 61, Gender.MALE,
                new Car("toyota", 2023, 323));
        user3.getSkills().add(new Skill("js",8));
        User user4 = new User(4, "Alina", "gb", "asd@asd.com", 41, Gender.FEMALE,
                new Car("toyota", 2023, 323));
        user4.getSkills().add(new Skill("js",8));
        User user5 = new User(5, "NLO", "NLO", "NLO@asd.com", 100, Gender.OTHER,
                new Car("toyota", 2023, 323));
        user5.getSkills().add(new Skill("js",8));
        User user6 = new User(6, "Gerald", "gb", "asd@asd.com", 31, Gender.MALE,
                new Car("toyota", 2023, 323));
        user6.getSkills().add(new Skill("js",8));
        user6.getSkills().add(new Skill("java",80));
        user6.getSkills().add(new Skill("python",180));
        User user7 = new User(7, "Lora", "hn", "asd@asd.com", 21, Gender.FEMALE,
                new Car("toyota", 2023, 323));
        user7.getSkills().add(new Skill("js",8));
        User user8 = new User(8, "Lamar", "nh", "asd@asd.com", 34, Gender.MALE,
                new Car("toyota", 2023, 323));
        user8.getSkills().add(new Skill("js",8));
        User user9 = new User(9, "Lina", "nh", "asd@asd.com", 15, Gender.FEMALE,
                new Car("toyota", 2023, 323));
        user9.getSkills().add(new Skill("js",8));
        user9.getSkills().add(new Skill("java",80));
        user9.getSkills().add(new Skill("python",180));
        User user10 = new User(10, "Franklin", "hnh", "asd@asd.com", 11, Gender.MALE,
                new Car("toyota", 2023, 323));
        user10.getSkills().add(new Skill("js",8));

        HashSet<User> users = new HashSet<>();

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        users.add(user8);
        users.add(user9);
        users.add(user10);


//       users.removeIf(user -> user.getGender() == Gender.MALE);
//        System.out.println(users);


        TreeSet<User> sortedUsers = new TreeSet<>(Comparator.comparingInt(user -> user.getSkills().size()));

        sortedUsers.addAll(users);
        System.out.println(sortedUsers);
    }

}
