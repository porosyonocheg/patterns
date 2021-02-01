package behavioral.command;

/**Команда воспроизведения предыдущего трека
 * @author Сергей Шершавин*/

public class PreviousTrack implements Command {
    Player player;

    public PreviousTrack (Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.prev();
    }
}
