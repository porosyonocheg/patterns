package Adapter;

public class Client {
    public static void main(String[] args) {
        TextEditor textEditor = new AdapterIntToString();
        String string = textEditor.receive();
        System.out.println(string);
        System.out.println("Remove first char: " + textEditor.removeChar(string, 0));
        System.out.println("Insert 'a' in the last position: " + textEditor.insertChar(string,'a',string.length()));
    }
}
