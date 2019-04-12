package org.nyu;

import org.nyu.zoo.*;

import java.lang.annotation.Annotation;
import java.util.ArrayList;


public class ZooApplication {

    /**
     * here is our main method - we'll use this to experiment with our Zoo model
     * @param args
     */

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        /**
         * This is the way we *should* instantiate our Animal list, but we may not want to commit to a generic type at
         * this time.
         *
         *                  ArrayList<Animal> myAnimals = new ArrayList<Animal>();
         *
         * We can make a list without committing to the generic type, but we'll get a warning even if we know for
         * certain that we are not mixing types within the list. Java gives us an AOP solution for ignoring this as seen
         * above!
         */

        // not the best way to instantiate a list - missing generic types
        ArrayList myAnimals = new ArrayList();

        // not allowed! Animal is an abstract interface!
        // Animal Appa = new Animal();

        // not allowed! Mammal is an abstract class!
        // Mammal Momo = new Mammal();

        // some polymorphism ...
        Animal Wiley = new Coyote();
        System.out.println("Wiley Coyote's color is: " + Wiley.getColor());

        Mammal Perry = new Platypus();
        System.out.println("Perry's call sounds like: " + Perry.call().get());

        // notice that canFly() is deprecated! The world may never truly know ...
        Chicken Torchic = new Chicken();
        System.out.println("Can Torchic fly? " + Torchic.canFly());

        // custom annotation example!
        Annotation WileyAnnotation = Wiley.getClass().getAnnotation(AnimalProperties.class);
        AnimalProperties WileyProperties = (AnimalProperties) WileyAnnotation;

        System.out.println("Wiley's sub-classification: " + WileyProperties.subClassification());

        Annotation TorchicAnnotation = Torchic.getClass().getAnnotation(AnimalProperties.class);
        AnimalProperties TorchicProperties = (AnimalProperties) TorchicAnnotation;

        System.out.println("Torchic's sub-classification: " + TorchicProperties.subClassification());

        // polymorphism again!
        myAnimals.add(Wiley);
        myAnimals.add(Perry);
        myAnimals.add(Torchic);

        Zoo myZoo = new Zoo(myAnimals);

    }
}
