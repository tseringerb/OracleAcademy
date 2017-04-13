package Turnip;

/**
 * Created by User on 11.04.2017.
 */
public class Dog extends Animal implements Pulling {
    public Dog()
    {
        super("Жучка");
    }

    @Override
    public void pullTheTurnip()
    {
        System.out.println(name + " " + iAmPulling);
    }
}
