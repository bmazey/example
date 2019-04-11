package org.nyu.zoo;

public class Chicken extends Bird {

    /**
     * Here we have an interesting problem ... Wikipedia classifies the domestic chicken as 'flightless,' but we know
     * from experience that chickens can fly to some extent. We also know that the default implementation of canFly()
     * from the abstract Bird class must return a Boolean and presently returns True.
     *
     * This could potentially pose an issue for any client code that would like to make use of our Zoo model. We can't
     * simply remove the method because doing so could break existing implementations and it violates the contract we've
     * established with the abstract class. Thankfully Java's AOP comes to our rescue!
     */

    @Override
    public String getColor() {
        return "orange";
    }

    @Override
    @Deprecated
    public Boolean canFly() {
        return false;
    }
}
