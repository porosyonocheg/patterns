package behavioral.command;

import java.util.Collections;
import java.util.List;
/**Музыкальный плеер является наследником @see{@link Player} и содержит данные о предыдущем, текущем и следующем треке
 * Содержит методы, моделирующие фактическую реализацию команд
 * @author Сергей Шершавин*/
public class MusicPlayer extends Player {
    private String currentTrack;
    private String nextTrack;
    private String prevTrack;

    private void setCurrentTrack(String currentTrack) {
        this.currentTrack = currentTrack;
    }

    public String getCurrentTrack() {
        return currentTrack;
    }

    public MusicPlayer(List<String> playList) {
        super(playList);
    }
/**Проигрывание текущего трека в списке*/
    @Override
    void play() {
            if (currentTrack == null) setCurrentTrack(playList.get(0));
            nextTrack = playList.size() > 1 ? playList.get(1) : getCurrentTrack();
            System.out.println("Играет " + getCurrentTrack() + "...");
    }
/**Проиграть трек с
 * @param s - название трека*/
    void play(String s) {
        setCurrentTrack(s);
        int nextTrackIndex = playList.indexOf(s) + 1;
        nextTrack = nextTrackIndex >= playList.size() ? playList.get(0) : playList.get(nextTrackIndex);
        System.out.println("Играет " + getCurrentTrack() + "...");
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException e) {}
    }
/**Приостанавливает воспроизведение текущего трека*/
    @Override
    void pause() {
        if (getCurrentTrack() != null)
        System.out.println("Пауза на треке " + getCurrentTrack() + "...");
        else System.out.println("Нечего приостанавливать...");
    }
/**Останавливает воспроизведение, сбрасывая все данные о проигрываемых треках*/
    @Override
    void stop() {
        if (getCurrentTrack() != null) {
        setCurrentTrack(null);
        nextTrack = null;
        prevTrack = null;
        System.out.println("Воспроизведение остановлено...");
        }
    }
/**Запускает следующий по списку трек*/
    @Override
    void next() {
        if (nextTrack != null) {
            prevTrack = currentTrack;
            play(nextTrack);
        }
        else play();
    }
/**Запускает предыдущий воспроизведенный трек, если он существует*/
    @Override
    void prev() {
        if (prevTrack != null) {
            nextTrack = currentTrack;
            play(prevTrack);
        }
        else play();
    }
/**Случайное изменение порядка композиций в плейлисте*/
    @Override
    void shuffle() {
        Collections.shuffle(playList);
    }
}
