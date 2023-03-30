package Proect3;

import java.util.ArrayList;
import java.util.List;

public class Home {
    
    private ArrayList<Animal> animals;
    

    public Home() {
        animals = new ArrayList<Animal>();
    }

    public Home addAnimal (Animal a) {
        animals.add(a);
        return this;
    }
    public List<Action> getAction() {
        List<Action> speak = new ArrayList<Action>();
        for (Animal an : animals) {
            speak.add(an);
            System.out.println(speak);
        }
        return speak;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

}


