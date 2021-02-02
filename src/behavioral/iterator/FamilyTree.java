package behavioral.iterator;

import java.util.LinkedList;

/** Данная коллекция представляет собой цепочку родственных связей.
 * @author Сергей Шершавин*/

public class FamilyTree implements PersonTree {
    Person head;
    LinkedList<Person> people = new LinkedList<>();

/** Констурктор содержит параметр:
 * @param head  - глава рода */

    public FamilyTree(Person head) {
        this.head = head;
        people.add(this.head);
    }

    /**Реализация фабричного метода с созданием конкретного интератора для данной коллекции*/
    @Override
    public PersonIterator getPersonIterator() {
        return new FamilyPersonIterator();
    }

    private class FamilyPersonIterator implements PersonIterator {

        /**Проверка существует ли следующий элемент коллекции*/

        @Override
        public boolean hasNext() {
            return !people.isEmpty();
        }

        /**Получение следующего элемента коллекции*/

        @Override
        public Person next() {
            Person person = people.pollFirst();
            if (person.children != null) {
                for (int i = person.children.size()-1; i >= 0; i--)
                    people.push(person.children.get(i));
            }
            return person;
        }
    }
}
