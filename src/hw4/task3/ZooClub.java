package hw4.task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZooClub {
    private final Map<Person, List<Pet>> club;

    public ZooClub() {
        club = new HashMap<>();
    }

    public void addMember(Person person) {
        club.putIfAbsent(person, new ArrayList<>());
    }

    public void addPetToMember(Person person, Pet pet) {
        List<Pet> pets = club.get(person);
        if (pets != null) {
            pets.add(pet);
        }
    }

    public void removePetFromMember(Person person, Pet pet) {
        List<Pet> pets = club.get(person);
        if (pets != null) {
            pets.remove(pet);
        }
    }

    public void removeMember(Person person) {
        club.remove(person);
    }

    public void removePetFromAllMembers(Pet pet) {
        for (List<Pet> pets : club.values()) {
            pets.removeIf(p -> p.equals(pet));
        }
    }

    @Override
    public String toString() {
        return "ZooClub{" +
                "club=" + club +
                '}';
    }
}
