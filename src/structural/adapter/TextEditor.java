package structural.adapter;

public interface TextEditor {
    String receive();
    String removeChar(String text, int index);
    String insertChar(String text, char c, int index);
}
