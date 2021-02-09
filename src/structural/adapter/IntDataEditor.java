package structural.adapter;

/** Сервис, работающий исключительно с целочисленными данными.
 * @author Сергей Шершавин*/

public class IntDataEditor {

    /**Метод генерирует случайный целочисленный массив случайной длины от 1 до 20 элементов*/

    int[] generateData() {
        int[] result = new int[(int)(Math.random()*20 + 1)];
        for (int i = 0; i < result.length; i++) {
            int current = 58;
            while ((current > 57 && current < 65) || (current > 90 && current < 97)) {
            current = (int) (Math.random()*74) + 48;
            }
            result[i] = current;
        }
        return result;
    }

    /**Удаление элемента целочисленного массива по индексу
     * @param array - исходный массив
     * @param index - позиция удаляемого элемента в массиве
     * @return result - массив без удаляемого элемента*/

    int[] removeData(int[] array, int index) {
        if (array.length == 0) throw new IllegalStateException("I can't remove anything");
        int[] result = new int[array.length-1];
        int i = 0;
        for (;i < index; i++) {
            result[i] = array[i];
        }
        for (; i < result.length; i++) {
            result[i] = array[i+1];
        }
        return result;
    }

    /**Вставка элемента в массив по индексу
     * @param array  - исходный массив
     * @param data - вставляемый элемент
     * @param index - позиция в массиве, куда вставляется новый элемент
     * @return result - обновлённый массив*/

    int[] insertData(int[] array, int data, int index) {
        int[] result = new int[array.length+1];
        int i = 0;
        for (;i < index; i++) {
            result[i] = array[i];
        }
        result[i] = data;
        for (;i<result.length-1; i++) {
            result[i+1] = array[i];
        }
        return result;
    }
}
