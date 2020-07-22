package Parts;

public abstract class Part {

    private String make;

    public Part(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }
}
