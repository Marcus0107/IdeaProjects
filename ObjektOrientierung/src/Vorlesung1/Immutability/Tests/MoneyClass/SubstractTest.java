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
public class SubstractTest
{
    private Money positionOne;
    private Money positionTwo;
    private Money expected;

    public SubstractTest(Money positionOne, Money positionTwo, Money expected)
    {
        this.positionOne = positionOne;
        this.positionTwo = positionTwo;
        this.expected = expected;
    }

    @Parameters(name = "{index}: testAdd({0} - {1} = {2}")
    public static Collection<Object[]> data() throws Exception
    {
        return Arrays.asList(new Object[][]{
                        {new Money(5, 0), new Money(3, 0), new Money(2, 0)},
                        {new Money(3, 50), new Money(2, 49), new Money(1, 01)},
                        {new Money(3, 50), new Money(2, 51), new Money(0, 99)},
                }
        );
    }

    @Test
    public void substractMoney() throws Exception
    {
        Money result = Money.SubstractMoney(positionOne, positionTwo);
        assertEquals(expected, result);

    }
}