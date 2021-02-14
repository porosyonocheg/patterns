package creational.builder;

import creational.builder.instruments.Drums;
import creational.builder.instruments.Flute;
import creational.builder.instruments.Trombone;
import creational.builder.instruments.Trumpet;

import java.util.ArrayList;
import java.util.List;

/** Строитель духового оркестра
В зависимости от заданного размера оркестра задаёт число всех духовых инструментов.
 * * @author Сергей Шершавин*/

public class BrassBandBuilder extends OrchestraBuilder{

    @Override
    public OrchestraBuilder stringsBuild() {
        return this;
    }

    @Override
    public OrchestraBuilder drumsBuild() {
        orchestra.setDrums(new Drums());
        return this;
    }

    @Override
    public OrchestraBuilder windBuild() {
        orchestra.setTrombones(createTrombones());
        orchestra.setSaxophones(null);
        orchestra.setTrumpets(createTrumpets());
        orchestra.setFlutes(createFlutes());
        return this;
    }

    private List<Trombone> createTrombones() {
        int amount;
        List<Trombone> list = new ArrayList<>();

        switch (size) {
            case BIG: amount = 4; break;
            case SMALL: amount = 0; break;
            default: amount = 2;
        }

        for (int i = 0; i < amount; i++) {
            list.add(new Trombone());
        }
        return list;
    }

    private List<Trumpet> createTrumpets() {
        int amount;
        List<Trumpet> list = new ArrayList<>();

        switch (size) {
            case BIG: amount = 10; break;
            case SMALL: amount = 3; break;
            default: amount = 6;
        }

        for (int i = 0; i < amount; i++) {
            list.add(new Trumpet());
        }
        return list;
    }

    private List<Flute> createFlutes() {
        int amount;
        List<Flute> list = new ArrayList<>();

        switch (size) {
            case BIG: amount = 2; break;
            case SMALL: amount = 0; break;
            default:   amount = 1;
        }

        for (int i = 0; i < amount; i++) {
            list.add(new Flute());
        }
        return list;
    }
}
