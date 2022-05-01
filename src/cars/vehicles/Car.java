package cars.vehicles;

import cars.details.Driver;
import cars.details.Engine;

public class Car {
    private String mark;
    private String car_class;
    private int weight;
    private Driver driver;
    private Engine motor;

    public Car(String mark, String car_class, int weight, Driver driver, Engine motor) {
        this.mark = mark;
        this.car_class = car_class;
        this.weight = weight;
        this.driver = driver;
        this.motor = motor;
    }

    public void star(){
        System.out.println("Поехали!");
    }
    public void stop(){
        System.out.println("Останавливаемся!");
    }
    public void turnLeft(){
        System.out.println("Поворот налево");
    }
    public void turnRight(){
        System.out.println("Поворот направо!");
    }

    public String getMark() {
        return mark;
    }

    public String getCar_class() {
        return car_class;
    }

    public int getWeight() {
        return weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public Engine getMotor() {
        return motor;
    }

    @Override
    public String toString() {
        return "Машина:" +
                " марка: " + mark + '\'' +
                ", класс: " + car_class + '\'' +
                ", масса: " + weight +
                " "+driver.toString()+'\''+
                " "+motor.toString();
    }
    public void driving(int num1) {
        switch (num1) {
            case 5:
                star();
                break;
            case 2:
                stop();
                break;
            case 3:
                turnRight();
                break;
            case 1:
                turnLeft();
                break;
            default: System.out.println("Ваше вождение оставляет желать лучшего");
        }
    }
}

