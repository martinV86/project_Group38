package animals.types;

import animals.animal.Animal;


public class Horse extends Animal {
    private boolean horseshoes;
    private String name;

    public Horse(String food, String location, boolean horseshoes, String name) {
        super(food, location);
        this.name = name;
        this.horseshoes = horseshoes;
    }

    @Override
    public void makeNois() {
        System.out.println("Лошадь скачет");
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест");
    }

    @Override
    public void sleep() {
        System.out.println("Лошадь спит");
    }

    @Override
    public String toString() {
        return
                "Подкована ли лошадь? " + horseshoes +
                        ", кличка " + name+", " +super.toString();
    }
}

