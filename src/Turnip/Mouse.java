package Turnip;

/**
 * Created by User on 11.04.2017.
 */
public class Mouse extends Animal implements Pulling {
    public Mouse() {
        super("Мышка");
    }


    @Override
    public void pullTheTurnip() {
        System.out.println(name + " " + iAmPulling);
    }
}
