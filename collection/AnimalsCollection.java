package collection;

import creature.Animal;
import java.util.ArrayList;
import java.util.List;

public class AnimalsCollection {

    private final List<Animal> animals;

    public AnimalsCollection() {
        animals = new ArrayList<>();
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void addAnimal(Animal animal) {
        if (!animals.contains(animal) && animal != null) {
            animals.add(animal);
        }
    }

    public void showAnimals(){
        if (animals.size() > 0){
            System.out.println("We have Animals at the moment: ");
            for (Animal animal: animals) {
                System.out.println(animal);
            }

        }else{
            System.out.println();
            System.out.println("No Animals at the moment");
        }
    }
}
