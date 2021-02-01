package creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Concert {
    public static void main(String[] args) {
        List<Trombone> trombones = new ArrayList<>();
        List<Trumpet> trumpets = new ArrayList<>();
        List<Saxophone> saxophones = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            saxophones.add(new Saxophone());
        }
        for (int i = 0; i < 4; i++) {
            trumpets.add(new Trumpet());
        }
        for (int i = 0; i < 3; i++) {
            trombones.add(new Trombone());
        }

        List<Violin> violins = new ArrayList<>();
        List<Cello> cellos = new ArrayList<>();
        List<Alto> altos = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            violins.add(new Violin());
        }
        for (int i = 0; i < 3; i++) {
            cellos.add(new Cello());
        }

        for (int i = 0; i < 2; i++) {
            altos.add(new Alto());
        }
        Flute flute = new Flute();
        Drums drums = new Drums();

        Orchestra.Builder concertBuilder = new Orchestra.Builder(trumpets, trombones, saxophones);

        System.out.println(concertBuilder.setAltos(altos).setCellos(cellos).setViolins(violins).setFlute(flute).setDrums(drums).build());
    }
}
