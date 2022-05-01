package animals.types;

import animals.animal.Animal;

public class Cat extends Animal {
    private String name;
    public Cat(String food, String location,String name) {
        super(food, location);
        this.name=name;

    }

    @Override
    public void makeNois() {
        System.out.println("Кот спит");

    }

    @Override
    public void eat() {
        System.out.println("Кот ест");

    }

    @Override
    public void sleep() {
        System.out.println("Кот опять спит");
    }

    @Override
    public String toString() {
        return
                "кличка " + name + " " + super.toString();
    }
}
