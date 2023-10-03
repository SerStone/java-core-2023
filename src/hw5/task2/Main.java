package hw5.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(20);
        numbers.add(-1);
        numbers.add(-2);
        numbers.add(-3);
        numbers.add(-4);
        numbers.add(-5);
        numbers.add(-7);

        numbers.sort(Integer::compareTo);
        System.out.println(numbers);

        List<Integer> numsMlt3 = numbers.stream()
                .filter(integer -> integer % 3 == 0)
                .collect(Collectors.toList());
        System.out.println(numsMlt3);

        List<Integer> numsMlt10 = numbers.stream()
                .filter(integer -> integer % 10 == 0)
                .collect(Collectors.toList());
        System.out.println(numsMlt10);

        numbers.forEach(number -> System.out.println(number + " "));

        List<Integer> nums = numbers.stream()
                .map(number -> number * 3)
                .collect(Collectors.toList());
        System.out.println(nums);
    }
}
