package structural.proxy;

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
