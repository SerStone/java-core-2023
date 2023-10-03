package hw5.task3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("AUDI",400,new Driver("Garold",25,1),10000,2005),
                new Car("TOYOTA",450,new Driver("Garold",25,2),20000,2021),
                new Car("MERCEDES",230,new Driver("Jeffry",26,1),15000,2015),
                new Car("BMW",150,new Driver("Larry",25,5),17500,2011),
                new Car("FIAT",250,new Driver("Jad",25,4),22000,2018),
                new Car("HONDA",570,new Driver("Dwain",25,5),11000,2006),
                new Car("MAZDA",170,new Driver("Zak",25,1),9000,2001)
        );

        List<Car> autoCustom = cars.stream()
                .limit(cars.size() / 2)
                .peek(car -> car.setEnginePower(car.getEnginePower() * 2))
                .collect(Collectors.toList());
        System.out.println(autoCustom);

        List<Car> autoSchool = autoCustom.stream()
                .filter(car -> car.getOwner().getExperience() < 5 && car.getOwner().getAge() > 25)
                .peek(car -> car.getOwner().setExperience(car.getOwner().getExperience()+1))
                .collect(Collectors.toList());
        System.out.println(autoSchool);

        double totalPrice = cars.stream()
                .mapToDouble(Car::getPrice)
                .sum();

        int totalPrice1 = (int) cars.stream()
                .mapToDouble(Car::getPrice)
                .sum();

        System.out.println(totalPrice);
        System.out.println(totalPrice1);
    }
}
