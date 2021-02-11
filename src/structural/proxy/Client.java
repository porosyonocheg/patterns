package structural.proxy;

/** Реализация паттерна Прокси. Моделирование подключения к серверу клиента с передачей местоположения на прямую и
 *  через прокси-сервер.
 * @author Сергей Шершавин*/

public class Client {
    private static final String country = "Russia";
    public static void main(String[] args) {
            Server server = new ServerImpl();
        System.out.println(server.getAccess(country));
        System.out.println("=====================================");
        System.out.println("Now we'll use the proxy:");
        server = new ProxyServerImpl();
        System.out.println(server.getAccess(country));
    }
}
