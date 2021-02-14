package creational.builder;

import creational.builder.instruments.*;

import java.util.List;

/** Модель оркестра
 * @author Сергей Шершавин*/

public class Orchestra {
    private List<Violin> violins;
    private List<Cello> cellos;
    private List<Alto> altos;
    private List<DoubleBass> doubleBasses;
    private List<Trumpet> trumpets;
    private List<Trombone> trombones;
    private List<Saxophone> saxophones;
    private List <Flute> flutes;
    private Piano piano;
    private Drums drums;

    public void setViolins(List<Violin> violins) {
        this.violins = violins;
    }

    public void setCellos(List<Cello> cellos) {
        this.cellos = cellos;
    }

    public void setAltos(List<Alto> altos) {
        this.altos = altos;
    }

    public void setDoubleBasses(List<DoubleBass> doubleBasses) {
        this.doubleBasses = doubleBasses;
    }

    public void setTrumpets(List<Trumpet> trumpets) {
        this.trumpets = trumpets;
    }

    public void setTrombones(List<Trombone> trombones) {
        this.trombones = trombones;
    }

    public void setSaxophones(List<Saxophone> saxophones) {
        this.saxophones = saxophones;
    }

    public void setFlutes(List<Flute> flutes) {
        this.flutes = flutes;
    }

    public void setPiano(Piano piano) {
        this.piano = piano;
    }

    public void setDrums(Drums drums) {
        this.drums = drums;
    }

    @Override
    public String toString() {
        StringBuilder current = new StringBuilder("Состав оркестра: \n");
        if (cellos != null) {
            for (Cello c : cellos) current.append(c).append(", ");
        }
        if (violins != null) {
            for (Violin v : violins) current.append(v).append(", ");
        }

        if (altos != null) {
            for (Alto a : altos) current.append(a).append(", ");

        }

        if (doubleBasses != null) {
            for (DoubleBass d : doubleBasses) current.append(d).append(", ");
        }

        if (flutes != null) {
            for (Flute f : flutes) current.append(f).append(", ");
        }

        if (piano != null) current.append(piano).append(", ");
        if (drums != null) current.append(drums).append(", ");

        if (saxophones != null) {
            for (Saxophone s : saxophones) current.append(s).append(", ");
        }
        for (Trombone t : trombones) current.append(t).append(", ");
        for (int i = 0; i < trumpets.size()-1; i++) current.append(trumpets.get(i)).append(", ");
        return current.append(trumpets.get(trumpets.size()-1)).toString();
    }
}

