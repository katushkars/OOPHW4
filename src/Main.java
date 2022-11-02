import transport.*;

public class Main {
    public static void main(String[] args) {
      Car car1 =new Car("Лада","Гранта",1.6);
        Car car2 =new Car("Волга","Siber",2.6);
        Car car3 =new Car("УАЗ","Патриот",3.6);
        Car car4 =new Car("Ока","Гном",1.0);
        Bus bus1=new Bus("ПАЗ","3205",1.2);
        Bus bus2=new Bus("ИКАРУС","417И",1.6);
        Bus bus3=new Bus("VOLGABUS","5270G",4.2);
        Bus bus4=new Bus("ЛАЗ","5292",1.2);
        Truck truck1=new Truck("КАМАЗ","Компас",3.2);
        Truck truck2=new Truck("ГАЗ","НЕКСТ",2.7);
        Truck truck3=new Truck("НЕФАЗ","4514",3.2);
        Truck truck4=new Truck("Урал","4320",3.2);
        DriverB alex= new DriverB("Алекс Шумахер", "В",10);
        DriverC mike=new DriverC("Михаил Петров","С",10);
      DriverD vova=new DriverD("Владимир Сайвор","D",10);

        car1.start();
      System.out.println( car2.bestTime());
      System.out.println(alex.driverCar(car3));
      System.out.println(alex.driverTruck(truck1));
      System.out.println(mike.driverTruck(truck1));
      System.out.println(vova.driverBus(bus1));

    }
}