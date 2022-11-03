package src.src.firstlecture;

public class FirstClass {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "FirstClass : {"  + type + "}";
    }
}
