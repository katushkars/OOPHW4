package transport;

public abstract class Transport {
   private String carBrand;
    private String model;
   private  double volume;

    @Override
    public String toString() {
        return "Транспортное средство:" +
                getClass()+
                "! марка: " + carBrand +
                ", модель: '" + model +
                ", объем двигателя: " + volume;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    public abstract void start();
    public abstract void finish();

    public Transport(String carBrand, String model, double volume) {
        this.carBrand = checkTransport(carBrand, "нет информации");
        this.model = checkTransport(model, "нет информации");
        if (volume == 0) {
            this.volume = 1.3 ;
        }this.volume = volume;
    }
    public String checkTransport(String value,String defoult){
        if(value==null||value.isBlank()||value.isEmpty()){
          return value=defoult;} else{return value=value;
        }

    }
}
