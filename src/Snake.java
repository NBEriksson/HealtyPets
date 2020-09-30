/**
 * Created by Nina Eriksson
 * Date: 2020-09-29
 * Time: 15:56
 * Project: HealtyPets
 * Copyright: MIT
 */

//Subklass
public class Snake extends Animal implements IamountOfFeed {

    AnimalFeed snakeFeed = AnimalFeed.ORMPELLETS;

    Snake() {
    }

    Snake(String name, int weight) {
        super(name, weight);
    }


    @Override
    public int amountOfFeed() {
        return 20;
    }


    //Polymorfism
    @Override
    public String sound() {
        return "Orm-ljud";
    }
}
