package Builder;

import java.util.List;

public class Orchestra {
    private final List<Violin> violins;
    private final List<Cello> cellos;
    private final List<Alto> altos;
    private final List<DoubleBass> doubleBasses;
    private final List<Trumpet> trumpets;
    private final List<Trombone> trombones;
    private final List<Saxophone> saxophones;
    private final Flute flute;
    private final Piano piano;
    private final Drums drums;

    public static class Builder {
        private final List<Trumpet> trumpets;
        private final List<Trombone> trombones;
        private final List<Saxophone> saxophones;

        private Flute flute = null;
        private Piano piano = null;
        private Drums drums = null;
        private List<Violin> violins = null;
        private List<Cello> cellos = null;
        private List<Alto> altos = null;
        private List<DoubleBass> doubleBasses = null;

        public Builder(List<Trumpet> trumpets, List<Trombone> trombones, List<Saxophone> saxophones) {
            this.trumpets = trumpets;
            this.trombones = trombones;
            this.saxophones = saxophones;
        }

        public Builder setFlute(Flute flute) {
            this.flute = flute;
            return this;
        }

        public Builder setPiano(Piano piano) {
            this.piano = piano;
            return this;
        }

        public Builder setDrums(Drums drums) {
            this.drums = drums;
            return this;
        }

        public Builder setViolins(List<Violin> violins) {
            this.violins = violins;
            return this;
        }

        public Builder setCellos(List<Cello> cellos) {
            this.cellos = cellos;
            return this;
        }

        public Builder setAltos(List<Alto> altos) {
            this.altos = altos;
            return this;
        }

        public Builder setDoubleBasses(List<DoubleBass> doubleBasses) {
            this.doubleBasses = doubleBasses;
            return this;
        }

        public Orchestra build() {
            return new Orchestra(this);
        }
    }
    private Orchestra (Builder builder) {
            violins = builder.violins;
            cellos = builder.cellos;
            altos = builder.altos;
            doubleBasses = builder.doubleBasses;
            drums = builder.drums;
            piano = builder.piano;
            flute = builder.flute;
            trumpets = builder.trumpets;
            trombones = builder.trombones;
            saxophones = builder.saxophones;
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

        if (flute != null) current.append(flute).append(", ");
        if (piano != null) current.append(piano).append(", ");
        if (drums != null) current.append(drums).append(", ");

        for (Trumpet t : trumpets) current.append(t).append(", ");
        for (Trombone t : trombones) current.append(t).append(", ");
        for (int i = 0; i < saxophones.size()-1; i++) current.append(saxophones.get(i)).append(", ");
        return current.append(saxophones.get(saxophones.size()-1)).toString();
    }
}

class Violin {
    static int number = 0;
    int num;
    Violin() {
        num = ++number;
    }

    @Override
    public String toString() {
        return "Скрипка №" + num;
    }
}

class Cello {
    static int number = 0;
    int num;
    Cello() {
        num = ++number;
    }

    @Override
    public String toString() {
        return "Виолончель №" + num;
    }
}

class Trumpet {
    static int number = 0;
    int num;
    Trumpet() {
        num = ++number;
    }

    @Override
    public String toString() {
        return "Труба №" + num;
    }
}

class Alto {
    static int number = 0;
    int num;
    Alto() {
        num = ++number;
    }

    @Override
    public String toString() {
        return "Альт №" + num;
    }
}

class DoubleBass {
    static int number = 0;
    int num;
    DoubleBass() {
        num = ++number;
    }

    @Override
    public String toString() {
        return "Контрабас №" + num;
    }
}

class Trombone {
    static int number = 0;
    int num;
    Trombone() {
        num = ++number;
    }

    @Override
    public String toString() {
        return "Тромбон №" + num;
    }
}
class Saxophone {
    static int number = 0;
    int num;
    Saxophone() {
        num = ++number;
    }

    @Override
    public String toString() {
        return "Саксофон №" + num;
    }
}

class Flute {
    @Override
    public String toString() {
        return "Флейта";
    }
}

class Piano {
    @Override
    public String toString() {
        return "Фортепиано";
    }
}

class Drums {
    @Override
    public String toString() {
        return "Ударные";
    }
}