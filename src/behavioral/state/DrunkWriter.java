package behavioral.state;

/** Пьяный писатель пишет текст задом наперёд, после чего ложиться спать, переходя в состояние {@link FreshWriter}
 * @author Сергей Шершавин*/

public class DrunkWriter extends Writer {
    public DrunkWriter(Human human) {
        super(human);
    }

    @Override
    void write() {
        String text = human.getText();
        if (text.isEmpty()) {
            System.out.println(human.getName() + " ничего не пишет.");
        }
        StringBuilder sb = new StringBuilder(text);
        System.out.println(human.getName() + " пишет текст: " + sb.reverse().toString());
        human.changeState(new FreshWriter(human));
    }
}
