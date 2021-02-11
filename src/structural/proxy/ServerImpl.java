package structural.proxy;

/** Реализация конкретного сервера, предоставляющего доступ к данным. Единственный метод по переданному местоположению
 * определяет разрешать ли доступ.
 * @author Сергей Шершавин*/

public class ServerImpl implements Server {

    @Override
    public String getAccess(String location) {
        if (location.equals("Russia") || location.isEmpty()) return "Access is denied!";
        return "Access is allowed!";
    }
}
