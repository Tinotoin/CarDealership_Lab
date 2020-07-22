package Parts;

public class Gearbox extends Part{

    private int numOfGears;

    public Gearbox(String make, int numOfGears) {
        super(make);
        this.numOfGears = numOfGears;
    }

    public int getNumOfGears() {
        return numOfGears;
    }
}
