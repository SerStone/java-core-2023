package hw4.task3;

public class Main {
    public static void main(String[] args) {

        ZooClub zooClub = new ZooClub();

        Person person1 = new Person("Garold");
        Person person2 = new Person("Fred");

        Pet pet1 = new Pet("Roxy");
        Pet pet2 = new Pet("Atakhan");


        zooClub.addMember(person1);
        zooClub.addMember(person2);
        zooClub.addPetToMember(person1, pet1);
        zooClub.addPetToMember(person2, pet2);
        zooClub.addPetToMember(person1, pet2);

        System.out.println(zooClub);
        System.out.println(person1);

//        zooClub.removeMember(person1);

        zooClub.removePetFromAllMembers(pet2);

//        zooClub.removePetFromMember(person1, pet1);

//        System.out.println(person1);
        System.out.println(zooClub);
    }
}
