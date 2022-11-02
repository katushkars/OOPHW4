package transport;

public class DriverD extends Driver<Bus>{
    public DriverD(String fullName, String categoryName, int yearDriving) {
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

    public String driverBus(Bus bus) {
        return "Водитель по имени: " +getFullName()+
                ", управляет транспортным средством" +bus.toString()+
                " и будет участвовать в заезде!";
    }
}
