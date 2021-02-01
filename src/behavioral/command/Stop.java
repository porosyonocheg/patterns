package behavioral.command;

/** Команда полной остановки воспроизведения
 * @author Сергей Шершавин*/

public class Stop implements Command {
    Player player;

    public Stop(Player player) {
        this.player = player;
    }
    @Override
    public void execute() {
        player.stop();
    }
}
