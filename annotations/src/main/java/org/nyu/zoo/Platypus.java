package org.nyu.zoo;

public class Platypus extends Mammal {

    /**
     * Uh oh! Now we have a Platypus. It's a Mammal, but the default implementations for getSize() and call() don't
     * apply here. How can we address this?
     *
     * Through method overloading we can overwrite the default implementation provided to us by the abstract class;
     * however, this could be confusing to the reader!
     */

    public String call() {
        return "coo-coo!";
    }
}
