package behavioral.iterator;

import java.util.List;

public class Person {
    String name;
    int age;
    List<Person> children;

    public Person(String name, int age, List<Person> children) {
        this.name = name;
        this.age = age;
        this.children = children;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return  name + ", возраст: " + age;
    }
}
