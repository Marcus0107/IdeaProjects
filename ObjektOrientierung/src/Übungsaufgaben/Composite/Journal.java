package Übungsaufgaben.Composite;

import sun.awt.image.ImageWatched;
import Übungsaufgaben.Builder.Invoice;
import Übungsaufgaben.Money;
import Übungsaufgaben.Visitor.CompositeVisitor;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PrimitiveIterator;

/**
 * Created by Marcus on 25.04.2017.
 */
public class Journal implements Composite
{
    private LinkedList<Invoice> invoices;
    private String name;

    public Journal(String name)
    {
        invoices = new LinkedList<>();
        this.name = name;
    }

    public void addInvoice(Invoice invoice)
    {
        invoices.add(invoice);
    }

    public LinkedList<Invoice> getInvoices()
    {
        return this.invoices;
    }

    @Override
    public Money getSum()
    {
        Money journalSum = new Money(0);
        for (Invoice invoice : invoices)
        {
            journalSum = journalSum.add(invoice.getSum());
        }
        return journalSum;
    }

    @Override
    public String toString()
    {
        return this.name + " Journal";
    }

    @Override
    public void accecpt(CompositeVisitor visitor)
    {
        visitor.visitJournal(this);
    }
}
