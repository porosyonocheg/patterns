package FactoryMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Concert {
    static MusicianFactory musicianFactory;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String kindOfMusician = bufferedReader.readLine();
        switch (kindOfMusician) {
            case "Pianist": musicianFactory = new PianistFactory(); break;
            case "Drummer": musicianFactory = new DrummerFactory(); break;
            case "Cellist": musicianFactory = new CellistFactory(); break;
            default: throw new RuntimeException("Unknown musician");
        }
        musicianFactory.createMusician().playMusic();
    }
}
