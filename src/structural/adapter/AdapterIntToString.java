package structural.adapter;

public class AdapterIntToString implements TextEditor {
    IntDataEditor intDataEditor = new IntDataEditor();
    @Override
    public String receive() {
        return createString(intDataEditor.generateData());
    }

    @Override
    public String removeChar(String text, int index) {
        return createString(intDataEditor.removeData(createIntArray(text), index));
    }

    @Override
    public String insertChar(String text, char c, int index) {
        return createString(intDataEditor.insertData(createIntArray(text), c, index));
    }

    private String createString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append((char)arr[i]);
        }
        return sb.toString();
    }
    private int[] createIntArray(String text) {
        int[] result = new int[text.length()];
        for (int i = 0; i < result.length; i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }
}
