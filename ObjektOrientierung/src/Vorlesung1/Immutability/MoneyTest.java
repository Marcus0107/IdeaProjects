package Vorlesung1.Immutability;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


/**
 * Created by Marcus on 23.03.2017.
 */
public class MoneyTest {

    @Test
    public void addUpTwoEuro() throws Exception {
        Money one = new Money(1,00);
        Money two = new Money(2,0);
        Money result = Money.AddUpMoney(one,two);
        Assert.assertEquals(3,result.getEuro());
        Assert.assertEquals(0,result.getCents());

        Money threeFifty = new Money(3,50);
        Money resultTwo = Money.AddUpMoney(two, threeFifty);
        Assert.assertEquals(5,resultTwo.getEuro());
        Assert.assertEquals(50,resultTwo.getCents());

        Money threeFiftyOne = new Money(3,51);
        Money resultThree = Money.AddUpMoney(threeFiftyOne,threeFifty);
        Assert.assertEquals(7,resultThree.getEuro());
        Assert.assertEquals(1,resultThree.getCents());

        Money toMuchCents = new Money(1,200);


    }


}