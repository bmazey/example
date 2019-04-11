package org.nyu.zoo;

import java.util.Optional;

public class Platypus extends Mammal {

    /**
     * Uh oh! Now we have a Platypus. It's a Mammal, but the default implementations for getSize() and call() don't
     * apply here. How can we address this?
     *
     * Through method overloading we can overwrite the default implementation provided to us by the abstract class;
     * however, this could be confusing to the reader! Thankfully Java provides a way to make the overloading of
     * inherited methods obvious to the reader through AOP!
     */

    @Override
    public Integer getSize() {
        return 2;
    }

    @Override
    public Optional<String> call() {
        return Optional.of("coo-coo!");
    }
}
