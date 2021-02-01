package structural.decorator;

public class Cook {
    public static void main(String[] args) {
        Pie pie = new Biscuit();
        System.out.println(pie.bake());

        Pie pie1 = new NutsPie(pie);
        System.out.println(pie1.bake());

        Pie pie2 = new Cake(pie1);
        System.out.println(pie2.bake());
    }
}
