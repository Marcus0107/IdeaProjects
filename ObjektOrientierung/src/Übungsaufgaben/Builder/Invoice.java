package Übungsaufgaben.Builder;

import Übungsaufgaben.AbstractFactory.InvoiceHeader;
import Übungsaufgaben.Composite.Composite;
import Übungsaufgaben.Money;
import Übungsaufgaben.Strategy.TaxCalculator;
import Übungsaufgaben.Visitor.CompositeVisitor;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Marcus on 12.04.2017.
 */
public class Invoice implements Composite
{
    private final LinkedList<LineItem> lineItemList;
    private final InvoiceHeader header;
    private final TaxCalculator taxCalculator;

    public Invoice(InvoiceHeader header, LinkedList<LineItem> lineItemList, TaxCalculator taxCalculator)
    {
        this.taxCalculator = taxCalculator;
        this.header = header;
        this.lineItemList = lineItemList;
    }


    public List<LineItem> getLineItems()
    {
        return Collections.unmodifiableList(lineItemList);
    }

    public Money getSalesTax()
    {
        return taxCalculator.calculate(this);
    }


    @Override
    public Money getSum()
    {
        Money lineItemSum = new Money(0);
        for (LineItem lineItem : lineItemList)
        {
            lineItemSum = lineItemSum.add(lineItem.getSum());
        }
        return lineItemSum;
    }

    public InvoiceHeader getHeader()
    {
        return header;
    }

    @Override
    public void accecpt(CompositeVisitor visitor)
    {
        visitor.visitInvoice(this);
    }
}
