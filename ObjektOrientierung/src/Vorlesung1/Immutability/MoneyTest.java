package Vorlesung1.Immutability;


import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assume;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


/**
 * Created by Marcus on 23.03.2017.
 */
@RunWith(Parameterized.class)
public class MoneyTest
{
    private Money positionOne;
    private Money positionTwo;
    private Money expected;
    private double faktor;
    private Type type;
    public MoneyTest(Money positionOne, Money positionTwo, Money expected, double faktor, Type type)
    {
        this.positionOne = positionOne;
        this.positionTwo = positionTwo;
        this.expected = expected;
        this.faktor = faktor;
        this.type = type;
    }

    @Parameters(name = "{index}: testAdd({0} and {1} = {2}")
    public static Collection<Object[]> data() throws Exception
    {
        return Arrays.asList(new Object[][]{
                        {new Money(1, 0), new Money(2, 0), new Money(3, 0), 0, Type.Add},
                        {new Money(3, 51), new Money(3, 50), new Money(7, 01), 0, Type.Add},
                        {new Money(3, 49), new Money(3, 50), new Money(6, 99), 0, Type.Add},

                        {new Money(5, 0), new Money(3, 0), new Money(2, 0), 0,Type.Substract},
                        {new Money(3, 50), new Money(2, 49), new Money(1, 01), 0,Type.Substract},
                        {new Money(3, 50), new Money(2, 51), new Money(0, 99), 0,Type.Substract},
                }
        );
    }

    @Test
    public void addUpTwoEuro() throws Exception
    {

        Assume.assumeTrue(type == Type.Add);
        Money result = Money.AddUpMoney(positionOne, positionTwo);
        assertEquals(expected, result);
    }
    @Test
    public void substractMoney() throws Exception
    {
        Assume.assumeTrue(type == Type.Substract);
        Money result = Money.SubstractMoney(positionOne,positionTwo);
        assertEquals(expected,result);

    }

    public void multiplie() throws Exception
    {
        //Case 1: "+" * "+"
        Money twoFifty = new Money(2, 50);
        double faktor = 2.5;
        Money result = Money.Multiply(twoFifty, faktor);
        assertEquals(result.getEuro(), 6);
        assertEquals(result.getCents(), 25);

        //Case 2: "-" * "-"
        Money threeThirdy = new Money(-3, 30);
        double faktor1 = (-3.25);
        Money newMoney1 = Money.Multiply(threeThirdy, faktor1);


    }


    enum Type
    {
        Add, Substract, Multiply
    }


}