package Turnip;

/**
 * Created by User on 11.04.2017.
 */
public class Cat extends Animal implements Pulling {
    public Cat() {
        super("Кошка");
    }

    @Override
    public void pullTheTurnip() {
        System.out.println(name + " " + iAmPulling);
    }
}
