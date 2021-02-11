package creational.singleton;

/** Система контроля версий содержит фабричный метод по созданию единственного экземпляра этого класса, который хранится
 * в поле instance и возвращается после всякого повторного вызова фабричного метода клиентом. В поле version хранит
 * номер текущей версии.
 * @author Сергей Шершавин*/

public class VersionControlSystem {
    private static VersionControlSystem instance;
    private String name;
    private int version = 0;

    private VersionControlSystem() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVersion() {
        return version;
    }

    private void setVersion(int version) {
        this.version = version;
    }

    /**Сохранение текущей версии*/

    public void commit() {
        setVersion(++version);
        System.out.println("Successful сommit! Current version is " + version);
    }

    /**Откат версии на предыдущую*/

    public void rollback() {
        setVersion(--version);
        System.out.println("Successful rollback to version: " + version);
    }

    public static VersionControlSystem getInstance() {
        VersionControlSystem currentVersionControlSystem = instance;
        if (currentVersionControlSystem == null) {
                synchronized (VersionControlSystem.class) {
                    currentVersionControlSystem = instance;
                    if (currentVersionControlSystem == null) {
                        instance = currentVersionControlSystem = new VersionControlSystem();
                    }
                }
        }
        return currentVersionControlSystem;
    }
}
