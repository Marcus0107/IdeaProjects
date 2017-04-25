package Übungsaufgaben.Builder;


import Übungsaufgaben.AbstractFactory.InvoiceHeader;
import Übungsaufgaben.Strategy.TaxCalculator;

import java.util.LinkedList;

/**
 * Created by Marcus on 12.04.2017.
 */
public class InvoiceBuilder
{
    private LinkedList<LineItem> lineItemList;
    private InvoiceHeader invoiceHeader;
    private TaxCalculator taxCalculator;

    public InvoiceBuilder()
    {
        lineItemList = new LinkedList<>();
    }

    public void addLineItem(LineItem item)
    {
        lineItemList.add(item);
    }

    public void addTaxCalculator(TaxCalculator taxCalculator)
    {
        this.taxCalculator = taxCalculator;
    }

    public void addInvoiceHeader(InvoiceHeader header)
    {
        this.invoiceHeader = header;
    }

    public void removeLineItem(LineItem item)
    {
        lineItemList.remove(item);
    }

    public Invoice create()
    {
        return new Invoice(invoiceHeader, lineItemList,taxCalculator);
    }
}
