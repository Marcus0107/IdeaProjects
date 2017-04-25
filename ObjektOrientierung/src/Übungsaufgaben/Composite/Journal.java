package Übungsaufgaben.Composite;

import sun.awt.image.ImageWatched;
import Übungsaufgaben.Builder.Invoice;

import java.util.Collection;
import java.util.LinkedList;
import java.util.PrimitiveIterator;

/**
 * Created by Marcus on 25.04.2017.
 */
public class Journal
{
    private LinkedList<Invoice> invoices;
    public Journal(){
        invoices = new LinkedList<>();
    }

    public void addInvoice(Invoice invoice){
        invoices.add(invoice);
    }

    public LinkedList<Invoice> getInvoices(){
        return this.invoices;
    }
}
