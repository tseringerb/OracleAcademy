package Turnip;

/**
 * Created by User on 11.04.2017.
 */
public class Granddad extends Human implements Pulling {
    public Granddad()
    {
        super("Дед");
    }

    @Override
    public void pullTheTurnip() {
        System.out.println(name + " " + iAmPulling);
    }
}
