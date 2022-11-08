package patterns.dto;

import java.util.Objects;

public class User {
    private String login;
    private String password;
    private Long timestamp;

    public User(String login, String password, Long timestamp) {
        this.login = login;
        this.password = password;
        this.timestamp = timestamp;
    }
    public User() {}

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) && Objects.equals(password, user.password) && Objects.equals(timestamp, user.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, timestamp);
    }
}
