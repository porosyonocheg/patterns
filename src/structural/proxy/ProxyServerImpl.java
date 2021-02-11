package structural.proxy;

/** Прокси-сервер служит прослойкой между клиентом и конечным сервером, передавая последнему свою локацию вместо клиентской.
 * @author Сергей Шершавин*/

public class ProxyServerImpl implements Server {
    String location = "USA";
    Server server = new ServerImpl();

    @Override
    public String getAccess(String location) {
        return server.getAccess(this.location);
    }
}
