import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nina Eriksson
 * Date: 2020-09-29
 * Time: 15:53
 * Project: HealtyPets
 * Copyright: MIT
 */

public class HealthyPets {

    public static void main(String args[]) {

        List<Animal> myListAnimals = new ArrayList<Animal>();

        myListAnimals.add(new Dog("Sixten", 5));
        myListAnimals.add(new Dog("Dogge", 10));
        myListAnimals.add(new Cat("Venus", 5));
        myListAnimals.add(new Cat("Ove", 3));
        myListAnimals.add(new Snake("Hypno", 1));

        String input;
        input = JOptionPane.showInputDialog("Vilket djur ska få mat?");

        boolean exist = false;
        int amountOfAnimalFeed = 0;
        String sound = "";
        AnimalFeed feed = null;


        for (int i = 0; i < myListAnimals.size(); i++) {

            if (myListAnimals.get(i).getName().equalsIgnoreCase(input)) {

                if (myListAnimals.get(i) instanceof Dog) {
                    Dog myDog = new Dog(myListAnimals.get(i).getName(), myListAnimals.get(i).getWeight());
                    amountOfAnimalFeed = myDog.amountOfFeed();
                    sound = myDog.sound();
                    feed = myDog.dogFeed;//Enum
                }
                if (myListAnimals.get(i) instanceof Cat) {
                    Cat myCat = new Cat(myListAnimals.get(i).getName(), myListAnimals.get(i).getWeight());
                    amountOfAnimalFeed = myCat.amountOfFeed();
                    sound = myCat.sound();
                    feed = myCat.catFeed;//Enum
                }
                if (myListAnimals.get(i) instanceof Snake) {
                    Snake mySnake = new Snake(myListAnimals.get(i).getName(), myListAnimals.get(i).getWeight());
                    amountOfAnimalFeed = mySnake.amountOfFeed();
                    sound = mySnake.sound();
                    feed = mySnake.snakeFeed;//Enum
                }
                exist = true;
                i = myListAnimals.size() + 1;
            }
        }

        if (exist == false) {
            JOptionPane.showMessageDialog(null, "Djuret bor inte på hotellet!");
        } else {
            JOptionPane.showMessageDialog(null, String.valueOf(amountOfAnimalFeed) + " gram, " + feed, sound, JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
