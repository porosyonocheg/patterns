package behavioral.command;

/**Команда запуска вопспроизведения треков
 * @author Сергей Шершавин*/

public class Play implements Command {
    Player player;

    public Play(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
    player.play();
    }
}
