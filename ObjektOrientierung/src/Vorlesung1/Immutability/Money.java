package Vorlesung1.Immutability;

/**
 * Created by Marcus on 20.03.2017.
 */
public class Money
{


    private final int euro;
    private final int cents;

    public Money(int euro, int cent) throws Exception
    {
        if (cent > 100 || cent < 0) throw new Exception();
        this.euro = euro;
        cents = Math.abs(cent);
    }

    public static Money AddUpMoney(Money positionOne, Money positionTwo) throws Exception
    {
        int newCents = positionOne.cents + positionTwo.cents;
        int newEuro = positionOne.euro + positionTwo.euro + (newCents - (newCents % 100)) / 100;

        return new Money(newEuro, newCents % 100);

    }

    public static Money SubstractMoney(Money positionOne, Money positionTwo) throws Exception
    {
        int resultCent;
        int resultEuro;


        resultEuro = positionOne.euro - positionTwo.euro;
        resultCent = positionOne.cents - positionTwo.cents;
        if (resultCent < 0)
        {
            resultEuro--;
            resultCent += 100;
        }

        return new Money(resultEuro, resultCent);

    }

    public static Money Multiply(Money money, double faktor) throws Exception
    {

        double newEuro;
        double newCent;


        if (faktor == 0) throw new Exception("Can´t multiplikate with 0");


        // "+" * "+"
        if (money.euro >= 0 && faktor >= 0)
        {
            newEuro = AddUpDouble(money.euro, faktor);
            newCent = AddUpDouble(money.cents, faktor);
        }
        //"-" * "-"
        else if (money.euro < 0 && faktor < 0)
        {
            faktor = Math.abs(faktor);
            newEuro = AddUpDouble(Math.abs(money.euro), faktor);
            newCent = AddUpDouble(money.cents, faktor);
        }
        //"-" * "+" or "+" * "-"
        else
        {
            faktor = Math.abs(faktor);
            newEuro = AddUpDouble(Math.abs(money.euro), faktor);
            newCent = AddUpDouble(money.cents, faktor);
            newEuro *= (-1);
        }


        newCent = newCent / 100;
        newEuro += newCent;
        String euroString = String.format("%.2f", newEuro);
        String[] split = euroString.split(",");
        return new Money(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
    }

    private static double AddUpDouble(int times, double value)
    {
        double newValue = 0;
        for (int i = 0; i < times; i++)
        {
            newValue += value;
        }
        return newValue;
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
        return euro;
    }

    @Override
    public String toString()
    {
        return this.euro + "," + String.format("%02d", this.cents) + " euro";
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Money money = (Money) o;

        if (this.getEuro() != money.getEuro()) return false;
        return getCents() == money.getCents();
    }

    @Override
    public int hashCode()
    {
        int result = getEuro();
        result = 31 * result + getCents();
        return result;
    }
}
