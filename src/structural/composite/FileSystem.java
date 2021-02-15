package structural.composite;

/** Реализация паттерна Компоновщик. Моделирование файловой системы и получения размера папок в ней.
 * @author Сергей Шершавин*/

public class FileSystem {
    public static void main(String[] args) {
        Folder root = new Folder();
        Folder child1 = new Folder();
        Folder child2 = new Folder();
        File file1 = new File(12);
        File file2 = new File(2);
        File file3 = new File(100);
        File file4 = new File(8);
        File file5 = new File(53);
        File file6 = new File(38);
        File file7 = new File(47);
        root.getComponents().add(file2);
        root.getComponents().add(file1);
        root.getComponents().add(child1);
        child1.getComponents().add(child2);
        child1.getComponents().add(file5);
        child1.getComponents().add(file7);
        child1.getComponents().add(file4);
        child2.getComponents().add(file3);
        child2.getComponents().add(file6);
        System.out.println(child1.getSize()); //246
        System.out.println(child2.getSize()); //138
        System.out.println(root.getSize()); //260
    }
}
