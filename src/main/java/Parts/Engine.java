package Parts;

public class Engine extends Part{

    private String type;

    public Engine(String make, String type) {
        super(make);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
