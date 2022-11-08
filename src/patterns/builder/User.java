package patterns.builder;

public class User {
    private String login;
    private String password;
    private Long timestamp;

    public static class UserBuilder {
        private String login;
        private String password;
        private Long timestamp;

        public UserBuilder setLogin(String login) {
            this.login = login;
            return this;
        }
        public UserBuilder setPassword(String password) {
            this.password = password;
            return this;
        }
        public UserBuilder setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public User build() {
            User user = new User();
            user.login = login;
            user.password = password;
            user.timestamp = timestamp;
            return user;
        }
    }
}
