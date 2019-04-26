package org.nyu.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    /**
     * Here is our Zoo class. We'll keep it simple and define a Zoo to be a list of animals.
     *
     * The default constructor will create an empty list of type Animal. The second constructor will allow the user to
     * specify a list of animals when making a new Zoo.
     */

    private List<Animal> Animals;

    // constructors
    public Zoo() {
        this.Animals = new ArrayList<>();
    }

    public Zoo(List<Animal> Animals) {
        this.Animals = Animals;
    }

    // setter and getter encapsulation for Animals list
    public List<Animal> getAnimals() {
        return Animals;
    }

    public void setAnimals(List<Animal> animals) {
        Animals = animals;
    }
}
