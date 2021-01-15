package creational.singletone;

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
