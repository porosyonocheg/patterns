package structural.composite;

/** Модель файла.
 * @author Сергей Шершавин*/

public class File implements Data {
    private int size;

    /**Конструктор содержит
    * @param size  - размер файла*/
    public File(int size) {
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }
}
