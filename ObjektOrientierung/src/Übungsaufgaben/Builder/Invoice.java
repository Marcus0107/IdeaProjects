package Übungsaufgaben.Builder;

import Übungsaufgaben.Money;

import javax.sound.sampled.Line;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Marcus on 12.04.2017.
 */
public class Invoice
{
    private final LinkedList<LineItem> lineItemList;

    public Invoice(LinkedList<LineItem> lineItemList)
    {
        this.lineItemList = lineItemList;
    }

    public Money invoiceSum()
    {
        long sum = 0;

        for (LineItem item : lineItemList)
        {
            sum += item.itemSum().getCents();
        }
        return new Money(sum);
    }
}
