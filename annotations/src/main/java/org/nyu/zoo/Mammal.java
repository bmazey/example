package org.nyu.zoo;

import java.util.Optional;


public abstract class Mammal implements Animal {

    /**
     * Abstract classes cannot be instantiated. Traditionally abstract classes have been used to provide default
     * implementations of interface methods. In the most recent versions of Java (8+) this can be done in interfaces
     * as well using keyword 'default.'
     *
     * Here we are going to provide the default implementations so our concrete classes don't have to!
     */

    public String getColor() {
        return "brown";
    }

    public Integer getSize() {
        return 5;
    }

    public Integer getNumberOfLimbs() {
        return 4;
    }

    public Optional<String> call() {
        return Optional.of("grrrrr!");
    }

    // We could add extra Mammal methods here if we wanted to! For example, this method which is unique to all Mammals.
    public Boolean isWarmBlooded() {
        return true;
    }

}
