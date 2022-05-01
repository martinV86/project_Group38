package animals;

import animals.animal.Animal;
import animals.types.Cat;
import animals.types.Dog;
import animals.types.Horse;
import animals.vet.Vet;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Vet vet=new Vet();
        Cat cat=new Cat("курицу","квартира","Матроскин");
        Dog dog=new Dog("кость","будка","Барбос",true);
        Horse horse=new Horse("сено","хлев",false, "Черныш");
        ArrayList<Animal>arrayList=new ArrayList<>();
        arrayList.add(cat);
        arrayList.add(dog);
        arrayList.add(horse);
        for (int i=0; i<arrayList.size();i++){
            System.out.println(arrayList.get(i)+ " - отправлен к ветеренару. \n Ветиренар дал следующие рекомендации");
            vet.treatAnimal(arrayList.get(i));
            System.out.println("После посещения ветеринара замечено следующее" +
                    " повидение:");
            arrayList.get(i).makeNois();
            arrayList.get(i).eat();
            arrayList.get(i).sleep();
            System.out.println();

        }
    }

}