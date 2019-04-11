package org.nyu.zoo;

public abstract class Bird implements Animal {

    /**
     * Abstract classes cannot be instantiated. Traditionally abstract classes have been used to provide default
     * implementations of interface methods. In the most recent versions of Java (8+) this can be done in interfaces
     * as well using keyword 'default.'
     *
     * Here we are going to provide the default implementations so our concrete classes don't have to!
     */

    public String getColor() {
        return "blue";
    }

    public Integer getSize() {
        return 2;
    }

    public Integer getNumberOfLimbs() {
        return 4;
    }

    public String call() {
        return "cluck!";
    }

    // We could add extra Bird methods here if we wanted to! For example, this method which is unique to all Birds.
    public Boolean canFly() {
        return true;
    }
}
