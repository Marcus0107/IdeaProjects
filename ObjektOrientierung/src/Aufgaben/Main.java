package Aufgaben;

import Aufgaben.Builder.Invoice;
import Aufgaben.Builder.InvoiceBuilder;
import Aufgaben.Builder.LineItem;
import Aufgaben.Immutability.Money;

/**
 * Created by Marcus on 20.03.2017.
 */
public class Main {
    public static void main(String[] args) throws  Exception {

        InvoiceBuilder builder = new InvoiceBuilder();
        builder.addLineItem(new LineItem("Product 1", 2,new Money(1100)));
        builder.addLineItem(new LineItem("Product 2",1, new Money((200))));

        Invoice invoice = builder.create();
        invoice.print();

        Money invoiceSume = invoice.getInvoiceSum();

        System.out.println("Sum: " + invoiceSume.asDouble());



    }
}
