package org.nyu.zoo;

public interface Animal {

    /**
     * This is our Animal interface. An interface should effectively describe all methods and properties shared among
     * classes that implement it.
     *
     * All methods defined here are implicitly abstract. You can think of an interface as a contract - when a class
     * implements an interface, that class makes a commitment to provide concrete implementations of each abstract
     * method defined within the interface.
     *
     * @return
     */

    String getColor();
    Integer getSize();
    Integer getNumberOfLimbs();
    String call();
}
