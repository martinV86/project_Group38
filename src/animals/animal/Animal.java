package animals.animal;

public abstract class Animal {
    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }
    public abstract void makeNois();
    public abstract void eat();
    public abstract void sleep();

    @Override
    public String toString() {
        return
                "животное ест: " + food +
                        ",  место проживания:  " + location;
    }
}
