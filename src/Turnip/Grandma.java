package Turnip;

/**
 * Created by User on 11.04.2017.
 */
public class Grandma extends Human implements Pulling {
    public Grandma()
    {
        super("Бабка");
    }

    @Override
    public void pullTheTurnip() {
        System.out.println(name + " " + iAmPulling);
    }
}
