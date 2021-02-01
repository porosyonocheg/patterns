package behavioral.command;
/**Модель физической или графической кнопки проигрывателя
 * @author Сергей Шершавин*/
public class PlayerButton {
    Command command;
/**Конструктор содержит:
 * @param command - команда соответствующая кнопке*/
    public PlayerButton(Command command) {
        this.command = command;
    }
/**Нажатие кнопки вызывает выполнение соответствующей ей команды, */
    void press() {
        command.execute();
    }
}
