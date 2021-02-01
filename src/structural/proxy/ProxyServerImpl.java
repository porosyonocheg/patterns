package structural.proxy;


public class ProxyServerImpl implements Server {
    String text = "USA";
    Server server = new ServerImpl();

    @Override
    public String getAccess(String text) {
        return server.getAccess(this.text);
    }
}
