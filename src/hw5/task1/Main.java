package hw5.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("bghbtob");
        words.add("bt");
        words.add("vgvgtvt");
        words.add("cec");
        words.add("adcadoc");
        words.add("nmjyomu");

        words.sort(String::compareTo);

        System.out.println(words);

        List<String> filteredWords = words.stream()
                .filter(word -> word.length() < 4)
                .collect(Collectors.toList());

        System.out.println(filteredWords);

    }
}
