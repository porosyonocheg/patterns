package Proxy;

public class ServerImpl implements Server {

    @Override
    public String getAccess(String text) {
        if (text.equals("Russia") || text.isEmpty()) return "Access is denied!";
        return "Access is allowed!";
    }
}
