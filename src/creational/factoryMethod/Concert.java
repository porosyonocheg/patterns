package creational.factoryMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** Реализация паттерна Фабричный метод. Конкретная фабрика создания музыканта зависит от вводимых в консоль данных.
 * Создание объекта музыканта и выполнение его метода происходит через общий интерфейс и не зависит от конкретной реализации.
 * @author  Сергей Шершавин*/

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
