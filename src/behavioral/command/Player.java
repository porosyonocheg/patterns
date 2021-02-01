package behavioral.command;

import java.util.List;
/**Модель абстрактного проигрывателя (музыки, видео, изображений и пр.)
 * @author Сергей Шершавин*/
public abstract class Player {
    List<String> playList;
/**Конструктор содержит список воспроизводимых сущностей (для простоты - их названия)*/
    public Player(List<String> playList) {
        this.playList = playList;
    }

    abstract void play();
    abstract void pause();
    abstract void stop();
    abstract void next();
    abstract void prev();
    abstract void shuffle();
}
