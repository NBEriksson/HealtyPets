/**
 * Created by Nina Eriksson
 * Date: 2020-09-29
 * Time: 15:56
 * Project: HealtyPets
 * Copyright: MIT
 */

//Subklass
public class Dog extends Animal implements IamountOfFeed {

    AnimalFeed dogFeed = AnimalFeed.HUNDFODER;

    Dog() {
    }

    Dog(String name, int weight) {
        super(name, weight);
    }


    @Override
    public int amountOfFeed() {
        return (super.getWeight() * 1000) / 100;
    }


    //Polymorfism
    @Override
    public String sound() {
        return "Hund-ljud";
    }
}
