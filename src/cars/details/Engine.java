package cars.details;

public class Engine {
    private int power;
    private String producer;
    public static boolean food_establishments;

    public Engine(int power, String producer) {
        this.power = power;
        this.producer=producer;
    }


    public int getPower() {
        return power;
    }

    public String getProducer() {
        return producer;
    }

    @Override
    public String toString() {
        return " Двигатель: " +
                "мощность: " + power +
                ", производство: " + producer + '\'';
    }
}
