/**
 * Created by Nina Eriksson
 * Date: 2020-09-29
 * Time: 15:56
 * Project: HealtyPets
 * Copyright: MIT
 */

//Subklass
public class Cat extends Animal implements IamountOfFeed {

    AnimalFeed catFeed = AnimalFeed.KATTFODER;

    Cat() {
    }

    Cat(String name, int weight) {
        super(name, weight);
    }


    @Override
    public int amountOfFeed() {
        return (super.getWeight() * 1000) / 150;
    }


    //Polymorfism
    @Override
    public String sound() {
        return "Katt-ljud";
    }
}
