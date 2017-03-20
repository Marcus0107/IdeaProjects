package Vorlesung1.Immutability;

/**
 * Created by Marcus on 20.03.2017.
 */
public class Euro {
    private final int Euro;
    private final int cents;

    //public Euro(){}
    public Euro(int euro, int cent) {
        Euro = euro;
        cents = cent;
    }

    public static Euro AddUpTwoEuros(Euro positionOne, Euro positionTwo) {

        int Cents = positionOne.cents + positionTwo.cents;

        int resultWholeEuro = positionOne.Euro + positionTwo.Euro + (Cents - (Cents % 100)) / 100;

        int resultCent = Cents % 100;

        return new Euro(resultWholeEuro, resultCent);

    }
    public static Euro SubstractTwoEuros(Euro positionOne, Euro positionTwo) {

        int Cents = positionOne.cents - positionTwo.cents;

        int resultWholeEuro = positionOne.Euro - positionTwo.Euro - (Cents - (Cents % 100)) / 100;

        int resultCent = Cents % 100;

        return new Euro(resultWholeEuro, resultCent);

    }
    public static Euro Multiplikate(Euro toMultiplikate, double faktor){
        int faktor1 = toMultiplikate.Euro *100 + toMultiplikate.cents*100 ;
        faktor1 *= faktor;
        int newEuro = faktor1 - (faktor1%100);
        int newCent = faktor1%100;
        return  new Euro(newEuro/100 ,newCent);

    }

    public void Print() {


        System.out.println("" + this.Euro + "," + String.format("%02d",this.cents) + " Euro");
    }

}
