package hw4.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(1, "Pedro", 25);
        User user2 = new User(2, "Ola", 21);
        User user3 = new User(3, "Pedro", 35);
        User user4 = new User(4, "Pedro", 55);
        User user5 = new User(5, "Robert", 23);
        User user6 = new User(6, "Pedro", 15);
        User user7 = new User(7, "Pedro", 27);
        User user8 = new User(8, "Pedro", 26);
        User user9 = new User(9, "Pedro", 43);
        User user10 = new User(10, "Pedro", 32);


        List<User> users = new ArrayList<>();
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

        users.sort(Comparator.comparingInt(User::getAge));

        System.out.println(users);

        users.sort((o1, o2) -> o2.getAge() - o1.getAge());

        System.out.println(users);


        ArrayList<String> strings = new  ArrayList<>();

        strings.add("asigy");
        strings.add("xcdvd");
        strings.add("fdbtn");
        strings.add("tbtby");
        strings.add("cercr");
        strings.add("rbttb");
        strings.add("bytby");
        strings.add("mumy");
        strings.add("asigy");
        strings.add("brbbr");
        strings.add("nhttb");
        strings.add("asigy");
        strings.add("qwer");
        strings.add("wefwef");
        strings.add("qwqwe");

//        Collections.sort(strings);
//        strings.sort(null);
        strings.sort(Comparator.naturalOrder());

        System.out.println(strings);
    }
}
