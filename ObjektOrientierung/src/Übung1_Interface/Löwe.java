package Übung1_Interface;

/**
 * Created by Marcus on 17.03.2017.
 */
public class Löwe implements Tier {
    public Löwe(){}

    @Override
    public String GibLaut() {
        return "Roawr";
    }

    @Override
    public String GibInformationen() {
        return "Ich habe vier Pfoten und eine große Mähne";
    }

}
