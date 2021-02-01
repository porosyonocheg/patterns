package behavioral.command;

/**Команда воспроизведения следующего трека
 * @author Сергей Шершавин*/

public class NextTrack implements Command {
    Player player;

    public NextTrack(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.next();
    }
}
