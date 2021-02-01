package behavioral.command;

/** Команда перемешивания списка воспроизведения
 * @author Сергей Шершавин*/

public class Shuffle implements Command {
    Player player;

    public Shuffle(Player player) {
        this.player = player;
    }
    @Override
    public void execute() {
        player.shuffle();
    }
}
