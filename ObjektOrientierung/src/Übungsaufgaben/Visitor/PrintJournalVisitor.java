package Übungsaufgaben.Visitor;

import Übungsaufgaben.Builder.Invoice;
import Übungsaufgaben.Builder.LineItem;
import Übungsaufgaben.Composite.Article;
import Übungsaufgaben.Composite.Composite;
import Übungsaufgaben.Composite.Journal;
import Übungsaufgaben.Money;

import java.util.Date;

/**
 * Created by Marcus on 27.04.2017.
 */
public class PrintJournalVisitor implements CompositeVisitor
{
    @Override
    public void visitInvoice(Invoice invoice)
    {
        long id = invoice.getHeader().getInvoiceId();
        Date date = invoice.getHeader().getUnixtimeAsDate();
        String receiver = invoice.getHeader().getReceiver().toString();
        System.out.println("\t" + "ID: " + id);
        System.out.println("\t" + "Date: " + date);
        System.out.println("\t" +  receiver);

        for (LineItem item : invoice.getLineItems())
        {
            item.accecpt(new PrintJournalVisitor());
        }
        Money invoiceSum = invoice.getSum();
        Money invoiceTax = invoice.getSalesTax();
        System.out.println("\t" +"Net sum: " + invoiceSum);
        System.out.println("\t" +"Tax sum: " + invoiceTax);
        System.out.println("\t" +"Gross sum: " + invoiceSum.add(invoiceTax));
        System.out.println("");
    }

    @Override
    public void visitJournal(Journal journal)
    {
        System.out.println(journal.toString());
        System.out.println("---------------");
        for (Invoice invoice : journal.getInvoices())
        {
            invoice.accecpt(new PrintJournalVisitor());
        }
        System.out.println("---------------");
        System.out.println("---------------");
        System.out.println("Journal sum: " + journal.getSum());
    }

    @Override
    public void visitLineItem(LineItem lineItem)
    {
        System.out.println("\t" + "\t" + lineItem.toString());
    }
}
