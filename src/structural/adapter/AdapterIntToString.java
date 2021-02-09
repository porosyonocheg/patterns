package structural.adapter;

/** Адаптер реализует методы клиентского интерфейса, выполняя модификацию типов данных.
 * @author Сергей Шершавин*/

public class AdapterIntToString implements TextEditor {
    IntDataEditor intDataEditor = new IntDataEditor();

    /**Генерация строки методом целочисленного редактора*/

    @Override
    public String receive() {
        return createString(intDataEditor.generateData());
    }

    /**Удаление в строке символа по индексу
     * @param text - исходная строка
     * @param index - позиция символа в строке, который будет удалён*/

    @Override
    public String removeChar(String text, int index) {
        return createString(intDataEditor.removeData(createIntArray(text), index));
    }

    /**Вставка символа в строку по индексу
     * @param text - исходная строка
     * @param c - вставляемый символ
     * @param index - позиция в строке, куда вставляем символ*/

    @Override
    public String insertChar(String text, char c, int index) {
        return createString(intDataEditor.insertData(createIntArray(text), c, index));
    }

/**Вспомогательный метод создания строки из целочисленного массива*/

    private String createString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append((char)arr[i]);
        }
        return sb.toString();
    }

    /**Вспомогательный метод создания целочисленного массива из строки*/

    private int[] createIntArray(String text) {
        int[] result = new int[text.length()];
        for (int i = 0; i < result.length; i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }
}
