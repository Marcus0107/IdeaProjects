package Vorlesung1.Interface;

/**
 * Created by Marcus on 17.03.2017.
 */
public class Main {
    public static void main(String[] args) {

        Tier katze = new Katze();
        Tier hund = new Hund();
        Tier löwe = new Löwe();

        Tier[] tiere = {katze,hund,löwe};
        for (Tier x : tiere) {
            System.out.println(x.GibLaut());

            System.out.println(x.GibInformationen());


        }
    }



}
