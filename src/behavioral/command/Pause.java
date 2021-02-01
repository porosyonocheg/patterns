package behavioral.command;

/** Команда установки паузы на текущем треке
 * @author Сергей Шершавин*/

public class Pause implements Command {
    Player player;

    public Pause(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.pause();
    }
}
