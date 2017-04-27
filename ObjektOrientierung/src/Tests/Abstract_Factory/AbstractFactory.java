package Tests.Abstract_Factory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import Übungsaufgaben.AbstractFactory.BackdateInvoiceFactory;
import Übungsaufgaben.AbstractFactory.InvoiceHeader;
import Übungsaufgaben.AbstractFactory.Receiver;
import Übungsaufgaben.Builder.Invoice;
import Übungsaufgaben.Builder.InvoiceBuilder;
import Übungsaufgaben.Builder.LineItem;
import Übungsaufgaben.Money;

/**
 * Created by Marcus on 23.03.2017.
 */
public class AbstractFactory
{/*
    @Test
    public void CreateInvoiceTest(){
        InvoiceBuilder builder = new InvoiceBuilder();
        BackdateInvoiceFactory backdateInvoiceFactory = new BackdateInvoiceFactory();
        Invoice invoice;

        LineItem screwdriver = new LineItem("Screwdriver",5,new Money(500));
        LineItem hammer = new LineItem("Hammer",10,new Money(1000));
        LineItem nails = new LineItem("Nails, 5cm",1000,new Money(5));
        builder.addLineItem(screwdriver);
        builder.addLineItem(hammer);
        builder.addLineItem(nails);

        Receiver receiver = new Receiver("Marcus","72800 Eningen");


        builder.addInvoiceHeader(backdateInvoiceFactory.createHeader(receiver));
        invoice = builder.create();

    }*/
}