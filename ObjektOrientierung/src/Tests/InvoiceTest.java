package Tests;

import org.junit.Test;
import Übungsaufgaben.AbstractFactory.InvoiceHeader;
import Übungsaufgaben.AbstractFactory.Receiver;
import Übungsaufgaben.Builder.Invoice;
import Übungsaufgaben.Builder.LineItem;
import Übungsaufgaben.Money;
import Übungsaufgaben.Strategy.AdvancedSalesTaxCalculator;
import Übungsaufgaben.Strategy.BasicSalesTaxCalculator;
import Übungsaufgaben.Strategy.TaxCalculator;

import java.util.LinkedList;

import static org.junit.Assert.*;

/**
 * Created by Marcus on 25.04.2017.
 */
public class InvoiceTest
{
    @Test
    public void getBasicSalesTax() throws Exception
    {
        InvoiceHeader header = new InvoiceHeader( 123, 33, new Receiver( "a", "b" ) );
        LinkedList<LineItem> lineItems = new LinkedList<>();
        //lineItems.add(new LineItem("Reduced",2,new Money(100)));
        lineItems.add(new LineItem("Reduced",1,new Money(300)));

        TaxCalculator calculator = new BasicSalesTaxCalculator(0.19);

        Invoice invoice = new Invoice(header,lineItems,calculator);

        assertEquals( 3.00 * 0.19, invoice.getSalesTax().asDouble(), 0.0001 );
    }
    @Test
    public void getAdvancedSalesTax() throws Exception
    {
        InvoiceHeader header = new InvoiceHeader( 123, 33, new Receiver( "a", "b" ) );
        LinkedList<LineItem> lineItems = new LinkedList<>();
        lineItems.add(new LineItem("Reduced",1,new Money(300)));
        lineItems.add(new LineItem("Not Red",3,new Money(300)));

        TaxCalculator calculator = new AdvancedSalesTaxCalculator(0.19,0.07,"Reduced");

        Invoice invoice = new Invoice(header,lineItems,calculator);

        assertEquals( (3*3.00 * 0.19) + (3.00*0.07) , invoice.getSalesTax().asDouble(), 0.0001 );
    }
}