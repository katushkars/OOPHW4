package transport;

public class DriverC extends Driver<Truck>{
    public DriverC(String fullName, String categoryName, int yearDriving) {
        super(fullName, categoryName, yearDriving);
    }

    @Override
    public void startDrive() {
    }

    @Override
    public void finishDrive() {

    }

    @Override
    public void relifTransport() {

    }




    @Override
    public String driverTruck(Truck truck) {
        return "Водитель по имени: " +getFullName()+
                ", управляет транспортным средством" +truck.toString()+
                " и будет участвовать в заезде!";
    }
}
