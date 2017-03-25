package Vorlesung1.Immutability;

/**
 * Created by Marcus on 20.03.2017.
 */
public class Money
{


    private final int Euro;
    private final int cents;

    public Money(int euro, int cent) throws Exception
    {
        if (cent > 100 || cent < 0) throw new Exception();
        Euro = euro;
        cents = cent;

    }

    public static Money AddUpMoney(Money positionOne, Money positionTwo) throws Exception
    {

        int Cents = positionOne.cents + positionTwo.cents;

        int resultWholeEuro = positionOne.Euro + positionTwo.Euro + (Cents - (Cents % 100)) / 100;

        int resultCent = Cents % 100;

        return new Money(resultWholeEuro, resultCent);

    }

    public static Money SubstractMoney(Money positionOne, Money positionTwo) throws Exception
    {
        int resultCent = 0;
        int resultEuro = 0;
        if (positionOne.cents > positionTwo.cents)
        {
            resultCent = positionOne.cents - positionTwo.cents;
        } else
        {
            resultCent =(10000- (positionOne.cents-positionTwo.cents)*100)/100;
        }
         resultEuro = positionOne.Euro - positionTwo.Euro;



        return new Money(resultEuro, resultCent/100);

    }

    public static Money MultiplikateWithInteger(Money money, double faktor) throws Exception
    {

        double newEuro = 0;
        double newCent = 0;

        if (faktor == 0) throw new Exception("Can´t multiplikate with 0");

        if (money.Euro >= 0 && faktor >= 0)
        {
            for (int i = 0; i < money.Euro; i++)
            {
                newEuro += faktor;
            }
            for (int i = 0; i < money.cents; i++)
            {
                newCent += faktor;
            }
        }


        newCent = newCent / 100;
        newEuro += newCent;
        String euroString = String.format("%.2f", newEuro);
        String[] split = euroString.split(",");
        return new Money(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
    }


    public void Print()
    {


        System.out.println(this.toString());
    }

    public int getCents()
    {
        return cents;
    }

    public int getEuro()
    {
        return Euro;
    }

    @Override
    public String toString()
    {
        return this.Euro + "," + String.format("%02d", this.cents) + " Euro";
    }

}
