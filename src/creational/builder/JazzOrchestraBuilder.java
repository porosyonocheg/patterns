package creational.builder;

import creational.builder.instruments.*;

import java.util.ArrayList;
import java.util.List;

/** Строитель джазового оркестра. Конструирование конкретной реализации оркестра в зависимости от размера.
 * Создание конкретных сущностей происходит в методах create...(); в методах ...Build() созданные сущности устанавливаются
 * в соответствующие поля целевого объекта {@link Orchestra}
 *  * @author Сергей Шершавин*/

public class JazzOrchestraBuilder extends OrchestraBuilder{

    @Override
    public OrchestraBuilder stringsBuild() {
        if (size == OrchestraSize.BIG) orchestra.setPiano(new Piano());
        orchestra.setAltos(createAltos());
        orchestra.setCellos(createCellos());
        orchestra.setViolins(createViolins());
        orchestra.setDoubleBasses(createDoubleBasses());
        return this;
    }

    @Override
    public OrchestraBuilder drumsBuild() {
        orchestra.setDrums(new Drums());
        return this;
    }

    @Override
    public OrchestraBuilder windBuild() {
        orchestra.setTrumpets(createTrumpets());
        orchestra.setSaxophones(createSaxophones());
        orchestra.setTrombones(createTrombones());
        orchestra.setFlutes(createFlutes());
        return this;
    }

    private List<Saxophone> createSaxophones() {
        int amount;
        List<Saxophone> list = new ArrayList<>();

        switch (size) {
            case BIG: amount = 5; break;
            case SMALL: amount = 1; break;
            default: amount = 3;
        }

        for (int i = 0; i < amount; i++) {
            list.add(new Saxophone());
        }
        return list;
    }

    private List<Trombone> createTrombones() {
        int amount;
        List<Trombone> list = new ArrayList<>();

        switch (size) {
            case BIG: amount = 5; break;
            case SMALL: amount = 2; break;
            default: amount = 3;
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
            case BIG: amount = 5; break;
            case SMALL: amount = 3; break;
            default: amount = 4;
        }

        for (int i = 0; i < amount; i++) {
            list.add(new Trumpet());
        }
        return list;
    }

    private List<Flute> createFlutes() {
        List<Flute> list = new ArrayList<>();
           if (size == OrchestraSize.BIG) list.add(new Flute());
        return list;
    }

    private List<Alto> createAltos() {
        List<Alto> list = new ArrayList<>();

        if (size == OrchestraSize.BIG)
        for (int i = 0; i < 2; i++) {
            list.add(new Alto());
        }

        return list;
    }

    private List<Cello> createCellos() {
        int amount;
        List<Cello> list = new ArrayList<>();

        switch (size) {
            case BIG: amount = 3; break;
            case SMALL: amount = 0; break;
            default: amount = 1;
        }

        for (int i = 0; i < amount; i++) {
            list.add(new Cello());
        }
        return list;
    }

    private List<Violin> createViolins() {
        int amount;
        List<Violin> list = new ArrayList<>();

        switch (size) {
            case BIG: amount = 5; break;
            case SMALL: amount = 1; break;
            default: amount = 3;
        }

        for (int i = 0; i < amount; i++) {
            list.add(new Violin());
        }
        return list;
    }

    private List<DoubleBass> createDoubleBasses() {
        int amount;
        List<DoubleBass> list = new ArrayList<>();

        switch (size) {
            case BIG: amount = 3; break;
            case SMALL: amount = 1; break;
            default: amount = 2;
        }

        for (int i = 0; i < amount; i++) {
            list.add(new DoubleBass());
        }
        return list;
    }
}
