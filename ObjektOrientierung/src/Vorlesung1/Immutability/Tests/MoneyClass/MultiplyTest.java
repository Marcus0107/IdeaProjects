package Vorlesung1.Immutability.Tests.MoneyClass;

import java.util.Arrays;
import java.util.Collection;

import Vorlesung1.Immutability.Money;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.assertEquals;

/**
 * Created by Marcus on 23.03.2017.
 */
@RunWith(Parameterized.class)
public class MultiplyTest
{

    private Money positionOne;
    private Money expected;
    private double faktor;


    public MultiplyTest(Money positionOne, Money expected, double faktor)
    {
        this.positionOne = positionOne;
        this.expected = expected;
        this.faktor = faktor;
    }

    @Parameters(name = "{index}: testAdd({0} * {2} = {1}")
    public static Collection<Object[]> data() throws Exception
    {
        return Arrays.asList(new Object[][]{
                        {new Money(5, 0), new Money(15, 0), 3.0,},
                        {new Money(5, 0), new Money(-12, 50), -2.5,},
                        {new Money(-3, 12), new Money(9, 83), -3.15,},
                        {new Money(-2, 95), new Money(6, 49), -2.2,},
                }
        );
    }


    @Test
    public void multiplie() throws Exception
    {

        Money result = Money.Multiply(positionOne, faktor);
        assertEquals(expected,result);


    }

}