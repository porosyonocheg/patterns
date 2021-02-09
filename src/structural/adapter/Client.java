package structural.adapter;

/** Реализация паттерна Адаптер. Клиентский класс, используя свой (текстовый) интерфейс отправляет символьные данные
 * в редактор, работающий с целыми числами посредством адаптера.
 * @author Сергей Шершавин*/

public class Client {
    public static void main(String[] args) {
        TextEditor textEditor = new AdapterIntToString();
        String string = textEditor.receive();
        System.out.println(string);
        System.out.println("Remove first char: " + textEditor.removeChar("", 0));
        System.out.println("Insert 'a' in the last position: " + textEditor.insertChar(string,'a',string.length()));
    }
}
