package behavioral.command;

import java.util.ArrayList;
import java.util.List;
/** В данном классе тестируется реализация паттерна "Команда". Создаётся плейлист (список строк),
 * создаётеся объект класса "приложения" (музыкальный плеер), в конструктор которого отправляется ранее
 * созданный список песен. Суть паттерна раскрывается созданием списка команд, поддерживаемых плеером:
 * Далее в цикле моделируется ситуация поочередного нажатия кнопок, которые вызывают соответствующие команды
 * @author Сергей Шершавин*/
public class MusicListener {
    public static void main(String[] args) {
        List<String> songs = new ArrayList<>();
        songs.add("Город 312 - Останусь");
        songs.add("Мельница - Королевна");
        songs.add("Manizha - Мама");
        songs.add("Муслим Магомаев - Синяя вечность");
        songs.add("Браво - Этот город");
        songs.add("Sting - Shape of My Heart");
        songs.add("Blur - Song 2");
        songs.add("Sia - One Million Bullets");
        songs.add("Florence + the Machine - Queen of Peace");
        songs.add("Frank Sinatra - Let It Snow");
        MusicPlayer musicPlayer = new MusicPlayer(songs);
        List<Command> commands = new ArrayList<>();
        commands.add(new Shuffle(musicPlayer));
        commands.add(new Play(musicPlayer));
        commands.add(new Pause(musicPlayer));
        commands.add(new NextTrack(musicPlayer));
        commands.add(new PreviousTrack(musicPlayer));
        commands.add(new Stop(musicPlayer));
        for (Command c : commands) new PlayerButton(c).press();

    }
}
