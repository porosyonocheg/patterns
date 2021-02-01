package behavioral.state;

public class FreshWriter extends Writer {
    public FreshWriter(Human human) {
        super(human);
    }

    @Override
    void write() {
        String text = human.getText();
        if (text.isEmpty()) {
            System.out.println(human.getName() + " ничего не пишет.");
            return;
        }

        StringBuilder sb = new StringBuilder();
        sb.append((Character.toUpperCase(text.charAt(0))));
        for (int i = 1; i < text.length(); i++) {
            if (text.charAt(i-1) == '.' || text.charAt(i-1) == '!' || text.charAt(i-1) == '?') {
                sb.append(' ');
                if (text.charAt(i) != ' ') {
                    sb.append(Character.toUpperCase(text.charAt(i)));
                }
                else {
                    sb.append(Character.toUpperCase(text.charAt(++i)));
                }
            }
            else sb.append(text.charAt(i));
        }
        System.out.println(human.getName() + " пишет текст: " + sb.toString());
        human.changeState(new AngryWriter(human));
    }
}
