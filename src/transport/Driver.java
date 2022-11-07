package transport;

public abstract class  Driver <D extends Transport> {
    private String fullName;
    private String categoryName;
    public int yearDriving;

    public Driver(String fullName, String categoryName, int yearDriving) {
        this.fullName = fullName;
        this.categoryName = categoryName;
        this.yearDriving = yearDriving;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setCategory (String categoryName){
        if( categoryName==null){
            throw new IllegalArgumentException("Необходимо указать тип прав!");
        }
        this.categoryName=categoryName;
    }

    public int getYearDriving() {
        return yearDriving;
    }

    public void setYearDriving(int yearDriving) {
        this.yearDriving = yearDriving;
    }

    public abstract void startDrive();

    public abstract void finishDrive();

    public abstract void relifTransport();


    public String driverTruck(Truck truck) {
        return "Водитель не может водить этот автомобиль";
    }

    public String driverCar(Car car) {
        return "Водитель не может водить этот автомобиль";
    }
    public String driverCar(Bus bus) {
        return "Водитель не может водить этот автомобиль";
    }

}
