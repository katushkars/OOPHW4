package transport;

public class Truck extends Transport implements Competing{
    public Carrying carrying;
    public enum Carrying {
        n1 ("с полной массой до 3,5 тонн"),
        n2("с полной массой от 3,5 тонн до 12 тонн"),
        n3("с полной массой свыше 12 тонн");

        private String carryingTruck;

        public String getCarryingTruck() {
            return carryingTruck;
        }

        public void setCarryingTruck(String carryingTruck) {
            this.carryingTruck = carryingTruck;
        }

        Carrying(String carryingTruck) {
            this.carryingTruck = carryingTruck;
        }


    }
    public Truck(String carBrand, String model, double volume, Carrying carrying) {
        super(carBrand, model, volume);
        this.carrying=carrying;
    }
    @Override
    public void start() {

    }

    @Override
    public void finish() {

    }

    @Override
    public String getPitStop() {
        return "ПИТ стопппп";
    }

    @Override
    public double bestTime() {
        return 0;
    }

    @Override
    public double maxSpeed() {
        return 0;
    }
    public String detemineCarryingTruck(){
        String typeTruck= carrying.getCarryingTruck();
        return "Грузоподъемность грузовика"
                +typeTruck;
    }
}
