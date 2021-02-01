package behavioral.iterator;

import java.util.LinkedList;

public class FamilyTree implements Tree {
    Person head;
    LinkedList<Person> people = new LinkedList<>();

    public FamilyTree(Person head) {
        this.head = head;
        people.add(this.head);
    }

    @Override
    public PersonIterator getPersonIterator() {
        return new FamilyPersonIterator();
    }

    private class FamilyPersonIterator implements PersonIterator {

        @Override
        public boolean hasNext() {
            return !people.isEmpty();
        }

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
