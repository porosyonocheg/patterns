package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/** Реализация паттерна Итератор в виде обхода модели генеалогического древа семейства
 * @author Сергей Шершавин
 */

public class Genealogy {
    public static void main(String[] args) {
        List<Person> childrenOfIvan = new ArrayList<>();
        List<Person> childrenOfMarfa = new ArrayList<>();
        childrenOfMarfa.add(new Person("Олег", 12));
        childrenOfMarfa.add(new Person("Елена", 6));
        childrenOfIvan.add(new Person("Марфа", 30, childrenOfMarfa));
        List<Person> childrenOfIgor = new ArrayList<>();
        childrenOfIgor.add(new Person("Степан", 7));
        childrenOfIvan.add(new Person("Игорь", 25, childrenOfIgor));
        List<Person> childrenOfSvyat = new ArrayList<>();
        List<Person> childrenOfVictor = new ArrayList<>();
        childrenOfVictor.add(new Person("Федор", 3));
        childrenOfVictor.add(new Person("Дмитрий", 6));
        childrenOfVictor.add(new Person("Ольга", 9));
        childrenOfSvyat.add(new Person("Виктор", 29, childrenOfVictor));
        List<Person> childrenOfIzya = new ArrayList<>();
        childrenOfIzya.add(new Person("Святополк", 5));
        childrenOfSvyat.add(new Person("Изяслав", 24, childrenOfIzya));
        List<Person> childrenOfSvetlana = new ArrayList<>();
        childrenOfSvetlana.add(new Person("Игнат", 1));
        childrenOfSvyat.add(new Person("Светлана", 19, childrenOfSvetlana));
        childrenOfSvyat.add(new Person("Сергей", 14));
        List<Person> children = new ArrayList<>();
        children.add(new Person("Иван", 50, childrenOfIvan));
        children.add(new Person("Святослав", 47, childrenOfSvyat));
        Person head = new Person ("Владимир", 72, children);
        FamilyTree familyTree = new FamilyTree(head);
        PersonIterator iterator = familyTree.getPersonIterator();
        while (iterator.hasNext()) {
            Person p = iterator.next();
            System.out.print(p + " -> ");
            if (p.children != null) {
                for (int i = 0; i < p.children.size()-1; i++) {
                    System.out.print(p.children.get(i) + "; ");
                }
                System.out.print(p.children.get(p.children.size()-1));
            }
            System.out.println();
        }
    }
}
