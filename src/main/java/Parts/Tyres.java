package Parts;

public class Tyres extends Part{

    private String type;

    public Tyres(String make, String type) {
        super(make);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
