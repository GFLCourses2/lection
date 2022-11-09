package patterns.proxy;

public class RealUser implements User {
    @Override
    public void printParameters(String login, String password, String timestamp) {
        System.out.println("Login=" + login + ", Password=" + password + ", Timestamp=" + timestamp);
    }
}
