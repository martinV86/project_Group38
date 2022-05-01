package animals.types;

import animals.animal.Animal;


public class Dog extends Animal {
    private String name;
    private boolean collar;
    public Dog(String food, String location, String name, boolean collar) {
        super(food, location);
        this.name=name;
        this.collar=collar;

    }

    @Override
    public void makeNois() {
        System.out.println("Собака охраняет");

    }

    @Override
    public void eat() {
        System.out.println("Собака ест");

    }

    @Override
    public void sleep() {
        System.out.println("Собака спит");
    }

    @Override
    public String toString() {
        return
                "кличка " + name  +
                        ". Имеет ли ошейник? " + collar +
                        ", "+super.toString();
    }
}
