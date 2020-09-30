/**
 * Created by Nina Eriksson
 * Date: 2020-09-29
 * Time: 15:55
 * Project: HealtyPets
 * Copyright: MIT
 */

//Superklass
public class Animal {

    //variablerna privata pga inkapsling (skydda från omvärlden)
    private String name;
    private int weight;

    Animal() {
    }

    Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    //Polymorfism
    public String sound() {
        return "Djur-ljud";
    }
}
