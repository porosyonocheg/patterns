package structural.adapter;

public class IntDataEditor {
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
