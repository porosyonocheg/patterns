package creational.singleton;

/** Реализация паттерна Синглтон (Одиночка). Для отдельно взятого проекта получаем из фабричного метода экземпляр
 * системы контроля версий. Производим некоторые манипуляции с данными. После чего пытаемся получить новый экземпляр
 * системы контроля версий. Если бы нам это удалось, мы бы потеряли все сохраненные данные о версиях и измениях в нашем
 * проекте. Можно убедиться, что в итоге мы работаем с одним и тем же экземпляром системы контроля версий.
 * @author Сергей Шершавин*/

public class Repository {
    public static void main(String[] args) {
        VersionControlSystem git = VersionControlSystem.getInstance();
        System.out.println(git);
        git.setName("Git");
        git.commit();
        git.commit();
        VersionControlSystem svn = VersionControlSystem.getInstance();
        System.out.println(svn);
        svn.setName("SVN");
        System.out.println("Current version is " + svn.getVersion());
        svn.rollback();
    }
}
