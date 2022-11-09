package src.src.com.berkunskaya.builder;

public class ClientB {
    private final String login;
    private final String password;
    private final Long timestamp;

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public static Builder newBuilder(){
        return new Builder();
    }

    public Builder toBuilder(){
        return  new Builder();
    }

    private ClientB(Builder builder){
        this.login = builder.login;
        this.password = builder.password;
        this.timestamp = builder.timestamp;
    }

    public static class Builder{
        private String login;
        private String password;
        private Long timestamp;

        public Builder() {
        }


        public Builder(String login, String password, Long timestamp) {
            this.login = login;
            this.password = password;
            this.timestamp = timestamp;
        }

        public Builder setLogin(String login) {
            this.login = login;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public ClientB build(){
            return new ClientB(this);
        }
    }

    @Override
    public String toString() {
        return "ClientB{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
