package Übung1_Interface;

/**
 * Created by Marcus on 17.03.2017.
 */
public class Katze implements Tier {


    public Katze() {
    }

    @Override
    public String GibLaut(){return "Miau!";}

    @Override
    public String GibInformationen(){return "Ich habe vier Pfoten und einen Schwanz";}



}
