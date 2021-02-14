package creational.builder;

/** Реализация паттерна Строитель. Устанавливаем для концертного директора размер и тип оркестра, получаем результат сборки.
 * @author Сергей Шершавин*/

public class Concert {
    public static void main(String[] args) {
        ConcertDirector director = new ConcertDirector();
        director.setOrchestraBuilder(new BrassBandBuilder());
        System.out.println("Начинаем наш концерт!");
        System.out.println("Первое отделение.");
        System.out.println(director.createOrchestra(OrchestraSize.MIDDLE));
        System.out.println("Второе отделение.");
        director.setOrchestraBuilder(new JazzOrchestraBuilder());
        System.out.println(director.createOrchestra(OrchestraSize.BIG));
    }
}
