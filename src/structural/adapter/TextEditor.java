package structural.adapter;

/**Клиентский интерфейс - протокол, через который клиент может работать с другими классами
 * @author Сергей Шершавин*/

public interface TextEditor {
    String receive();
    String removeChar(String text, int index);
    String insertChar(String text, char c, int index);
}
