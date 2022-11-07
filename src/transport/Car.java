package transport;

public class Car extends Transport implements Competing{
    public BodyType bodyType;

    public  enum BodyType {
        sedan("Седан"),
        hatchback("Хэчбек"),
        coupe("Купе"),
        universal("Универсал"),
        suv("Внедорожник"),
        crossover("Кроссовер"),
        wagon("Пикап"),
        van (""),
        minivan("Минивен");

        private String typeCar;

        BodyType(String typeCar) {
            this.typeCar = typeCar;
        }


        public String getTypeCar() {
            return typeCar;
        }

        public void setTypeCar(String typeCar) {
            this.typeCar = typeCar;
        }
    }
    public Car(String carBrand, String model, double volume, BodyType bodyType) {
        super(carBrand, model, volume);
        this.bodyType=bodyType;
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
    public String determineBodyType (){
        String carBody = bodyType.getTypeCar();
        if (carBody==null){
            return  carBody="Тип автомобиля не указан";}else{ return carBody=bodyType.getTypeCar();}
        }
    }

