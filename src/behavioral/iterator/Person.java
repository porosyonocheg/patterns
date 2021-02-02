package behavioral.iterator;

import java.util.List;

/** Модель человека - сущности, содержащейся в коллекции
 * @see FamilyTree
 * @author Сергей Шершавин*/

public class Person {
    String name;
    int age;
    List<Person> children;
/**Конструктор содержит параметры:
 * @param name - имя человека
 * @param age - возраст человека*/

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**Перегруженный конструктор также содержит параметр:
     * @param children - список детей человека*/

    public Person(String name, int age, List<Person> children) {
        this.name = name;
        this.age = age;
        this.children = children;
    }

    @Override
    public String toString() {
        return  name + ", возраст: " + age;
    }
}
