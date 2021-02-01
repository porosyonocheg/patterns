package behavioral.state;

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
