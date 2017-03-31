package Vorlesung1;

/**
 * Created by Marcus on 17.03.2017.
 */
public class Hund implements Tier{
    public Hund(){}
    @Override
    public String GibLaut() {
        return "Wau Waut";
    }

    @Override
    public String GibInformationen() {
        return "Ich bin der beste Freund des Mensches";
    }
}
