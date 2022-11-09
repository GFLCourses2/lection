package patterns.proxy;

public class ProxyUser implements User {
    private RealUser realUser;
    @Override
    public void printParameters(String login, String password, String timestamp) {
        if (realUser == null) {
            realUser = new RealUser();
        }
        realUser.printParameters(login, password, timestamp);
    }
}
