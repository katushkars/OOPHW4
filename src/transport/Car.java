package transport;

public class Car extends Transport implements Competing{
    public Car(String carBrand, String model, double volume) {
        super(carBrand, model, volume);
    }

    @Override
    public void start() {
        System.out.println("Я "+toString());
        System.out.println("ВСтавляю ключ, завожу двигатель, нажимаю педаль газ");

    }

    @Override
    public void finish() {
        System.out.println("нажимаю педаль тормоз, глушу мотор, достаю ключ");

    }

    @Override
    public String getPitStop() {
        return toString() + "Время пит стопа!";
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
