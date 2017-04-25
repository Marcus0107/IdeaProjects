package Übungsaufgaben.Builder;

import Übungsaufgaben.AbstractFactory.InvoiceHeader;
import Übungsaufgaben.Money;
import Übungsaufgaben.Strategy.TaxCalculator;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Marcus on 12.04.2017.
 */
public class Invoice
{
    private final LinkedList<LineItem> lineItemList;
    private final InvoiceHeader header;
    private  final TaxCalculator taxCalculator;
    public Invoice(InvoiceHeader header, LinkedList<LineItem> lineItemList, TaxCalculator taxCalculator)
    {
        this.taxCalculator = taxCalculator;
        this.header = header;
        this.lineItemList = lineItemList;
    }

    public Money invoiceSum()
    {
        long sum = 0;

        for (LineItem item : lineItemList)
        {
            sum += item.getItemSum().getCents();
        }
        return new Money(sum);
    }

    public List<LineItem> getLineItems(){
        return  Collections.unmodifiableList(lineItemList);
    }

    public Money getSalesTax(){
        return taxCalculator.calculate(this);
    }


    public void print()
    {
        String listAsString = "";
        for (LineItem item : lineItemList)
        {
            listAsString += "\n" + item.toString();
        }
        System.out.println(header.toString() + listAsString);
    }
}
