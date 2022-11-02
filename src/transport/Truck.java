package transport;

public class Truck extends Transport implements Competing{
    public Truck(String carBrand, String model, double volume) {
        super(carBrand, model, volume);
    }

    @Override
    public void start() {

    }

    @Override
    public void finish() {

    }

    @Override
    public String getPitStop() {
        return null;
    }

    @Override
    public double bestTime() {
        return 0;
    }

    @Override
    public double maxSpeed() {
        return 0;
    }
}
