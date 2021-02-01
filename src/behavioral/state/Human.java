package behavioral.state;

public class Human {
    private String name, text;
    private Writer writer;

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    public Human(String name, String text) {
        this.name = name;
        this.text = text.toLowerCase();
        writer = new FreshWriter(this);
    }

    void changeState(Writer writer) {
        this.writer = writer;
    }

    void write() {
        writer.write();
    }
}
