package Turnip;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 11.04.2017.
 */

/*
Granddad
Grandma
Granddaughter
Dog
Cat
Mouse
*/
public class Main {
    public static void main(String[] args) {
        List<Pulling> allCharectors = new ArrayList<>();
        allCharectors.add(new Granddad());
        allCharectors.add(new Grandma());
        allCharectors.add(new Granddaughter());
        allCharectors.add(new Dog());
        allCharectors.add(new Cat());
        allCharectors.add(new Mouse());

        for (Pulling charector : allCharectors) {
            charector.pullTheTurnip();
            if(charector instanceof Mouse)
            {
                System.out.println("Вытянули репку!!!");
            }
            else
            {
                System.out.println("Вытянуть не может(((");
            }
        }

    }
}
