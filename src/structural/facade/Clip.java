package structural.facade;

/** Модель музыкального клипа.
 * @author Сергей Шершавин*/

public class Clip {
    String song;
    int monetaryValue;

    /**Конструктор содержит:
     * @param song - песня, на которую снимается клип
     * @param monetaryValue - денежные средства, выделенные на клип*/

    Clip(String song, int monetaryValue) {
        this.song = song;
        this.monetaryValue = monetaryValue;
    }
}
