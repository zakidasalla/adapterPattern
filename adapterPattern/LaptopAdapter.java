package adapterPattern;

public class LaptopAdapter implements PowerOutlet{
    private Laptop lappy;

    public LaptopAdapter(Laptop lappy){
        this.lappy = lappy;
    }

    @Override
    public String plugIn() {
        return lappy.charge();
    }
}