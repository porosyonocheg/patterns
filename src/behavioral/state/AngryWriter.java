package behavioral.state;

/** Злой писатель пишет весь текст заглавными буквами, после чего становится усталым, перейдя в состояние {@link TiredWriter}
 * @author Сергей Шершавин*/

public class AngryWriter extends Writer {
    public AngryWriter(Human human) {
        super(human);
    }

    @Override
    void write() {
        String text = human.getText();
        if (text.isEmpty()) {
            System.out.println(human.getName() + " ничего не пишет.");
        }
        else {
            System.out.println(human.getName() + " пишет текст: " + text.toUpperCase());
            human.changeState(new TiredWriter(human));
        }
    }
}
