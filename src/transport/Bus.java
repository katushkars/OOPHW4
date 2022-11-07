package transport;

public class Bus extends Transport implements Competing{
    public enum Capacity {xs,x,m,l,xl}
    public Bus(String carBrand, String model, double volume) {
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
        return "Автобус. Остановка для смены колес";
    }

    @Override
    public double bestTime() {
        return 10;
    }

    @Override
    public double maxSpeed() {
        return 74;
    }
}
