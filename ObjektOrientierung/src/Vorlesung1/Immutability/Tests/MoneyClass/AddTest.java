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
public class AddTest
{
    private Money positionOne;
    private Money positionTwo;
    private Money expected;

    public AddTest(Money positionOne, Money positionTwo, Money expected)
    {
        this.positionOne = positionOne;
        this.positionTwo = positionTwo;
        this.expected = expected;
    }

    @Parameters(name = "{index}: testAdd({0} + {1} = {2}")
    public static Collection<Object[]> data() throws Exception
    {
        return Arrays.asList(new Object[][]{
                        {new Money(1, 0), new Money(2, 0), new Money(3, 0)},
                        {new Money(3, 51), new Money(3, 50), new Money(7, 01)},
                        {new Money(3, 49), new Money(3, 50), new Money(6, 99)},
                }
        );
    }

    @Test
    public void addUpTwoEuro() throws Exception
    {
        Money result = Money.AddUpMoney(positionOne, positionTwo);
        assertEquals(expected, result);
    }
}