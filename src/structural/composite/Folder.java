package structural.composite;

import java.util.ArrayList;
import java.util.List;

/** Модель папки файловой системы. Поле components хранит список внутренних файлов и папок.
 * @author Сергей Шершавин*/

public class Folder implements Data {
    private List<Data> components = new ArrayList<>();


    /**Возвращает размер файлов, хранящихся в данной папке и во всех внутренних папках*/
    @Override
    public int getSize() {
        int size = 0;
        for (Data d  : components) size += d.getSize();
        return size;
    }

    public List<Data> getComponents() {
        return components;
    }
}
