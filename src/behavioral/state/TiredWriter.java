package behavioral.state;

/** Уставший писатель пишет текст, пропуская каждый 5-й символ, после чего напивается и переходит в состояние {@link DrunkWriter}
 * @author Сергей Шершавин*/

public class TiredWriter extends Writer {

    public TiredWriter(Human human) {
        super(human);
    }

    @Override
    void write() {
        String text = human.getText();
        if (text.isEmpty()) {
            System.out.println(human.getName() + " ничего не пишет.");
        }
        StringBuilder sb = new StringBuilder();
        sb.append((Character.toUpperCase(text.charAt(0))));
        for (int i = 1; i < text.length(); i++) {
            if (i%5 != 0) sb.append(text.charAt(i));
        }
        System.out.println(human.getName() + " пишет текст: " + sb.toString());
        human.changeState(new DrunkWriter(human));
    }
}
