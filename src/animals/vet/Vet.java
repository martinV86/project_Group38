package animals.vet;


import animals.animal.Animal;

public class Vet {
    public void treatAnimal(Animal animal){
        System.out.println("Рекомендации врача: \n давть есть -"+ animal.getFood()+", животное должно находиться в: "+animal.getLocation());

    }
}
