package Turnip;

/**
 * Created by User on 11.04.2017.
 */
public class Granddaughter extends Human implements Pulling {
    public Granddaughter()
    {
        super("Внучка");
    }


    @Override
    public void pullTheTurnip() {
        System.out.println(name + " " + iAmPulling);
    }
}
