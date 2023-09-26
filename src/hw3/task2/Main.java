package hw3.task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Drum drum = new Drum(Type.Drum, 100);
        Guitar guitar = new Guitar(Type.Guitar, 6);
        Trumpet trumpet = new Trumpet(Type.Trumpet, 14.5);

        ArrayList<Instrument> instruments  = new ArrayList<>();
        instruments.add(drum);
        instruments.add(guitar);
        instruments.add(trumpet);

        for (Instrument instrument : instruments) {
            instrument.play();
        }

    }
}
