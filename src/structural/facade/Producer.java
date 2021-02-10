package structural.facade;

/** Фасад содержит все необходимые компоненты для создания конечного продукта.
 * Модель продюсера, содержи объекты
 * @see Casting
 * @see Director
 * @see Editing
 * @see SocialMedia
 * @author Сергей Шершавин*/


public class Producer {
    Casting casting = new Casting();
    Director director = new Director();
    Editing editing = new Editing();
    SocialMedia socialMedia = new SocialMedia();
    public Producer() {
    }

    /**Вызов в определенном порядке методов компонентов системы с распределением между ними определенным образом
     * денежных средств для получения конечно продукта*/

    public void createClip(Clip clip) {
    casting.selectScreenWriter(clip.monetaryValue/10);
    casting.selectActors(clip.monetaryValue/5);
    director.makeClip(clip.monetaryValue/2);
    editing.cut(clip.monetaryValue * 2 / 5);
    socialMedia.promote(clip.song, clip.monetaryValue * 3 / 10);
    }

}
