package transport;


public class DriverB extends Driver<Car>{


    public DriverB(String fullName, String categoryName, int yearDriving) {
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
    public String driverCar(Car car) {
        return "Водитель по имени: " +getFullName()+
                ", управляет транспортным средством" +car.toString()+
                " и будет участвовать в заезде!";
    }
}
