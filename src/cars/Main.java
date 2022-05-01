package cars;

import cars.details.Driver;
import cars.details.Engine;
import cars.vehicles.Car;
import cars.vehicles.Lorry;
import cars.vehicles.SportCar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Driver driver1= new Driver("Александр","Мартин","Васильевич",9);
        Driver driver2=new Driver("Сергей","Мартин","Васильевич",4);
        Driver driver3=new Driver("Василий","Мартин","Сергеевич",15);
        Engine motor1=new Engine(2600,"BMW");
        Engine motor2=new Engine(1600,"VAZ");
        Engine motor3=new Engine(3500,"Volvo");
        Car car=new Car("BMW","A5",2000, driver1, motor1);
        SportCar sportCar=new SportCar("Lada","C",1600,driver2,motor2);
        Lorry lorry=new Lorry("Volvo","D",3000,driver3,motor3);
        System.out.println(car.toString());
        System.out.println(lorry.toString());
        System.out.println(sportCar.toString());
        int num1;
        do {
            System.out.println("Управляйте машиной (движение вперед -5, остановиться -2, поворот вправо -3, влево -1. выйти из программы -0):");
            num1 = scanner.nextInt();
            car.driving(num1);
        }
        while (num1!=0);


    }
}

