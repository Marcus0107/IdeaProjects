package Tests;

import org.junit.Assert;
import org.junit.Test;
import Übungsaufgaben.AbstractFactory.DefaultInvoiceFactory;
import Übungsaufgaben.AbstractFactory.Receiver;
import Übungsaufgaben.Builder.Invoice;
import Übungsaufgaben.Builder.InvoiceBuilder;
import Übungsaufgaben.Builder.LineItem;
import Übungsaufgaben.Composite.Article;
import Übungsaufgaben.Composite.Journal;
import Übungsaufgaben.Money;
import Übungsaufgaben.Strategy.BasicSalesTaxCalculator;
import Übungsaufgaben.Visitor.PrintJournalVisitor;

import static org.junit.Assert.*;

/**
 * Created by Marcus on 27.04.2017.
 */
public class JournalTest
{
    @Test
    public void getSum() throws Exception
    {
        Article hammer = new Article("Hammer", new Money(507));
        Article nails = new Article("Nail", new Money(407));
        Article wood = new Article("Wood",new Money(307));

        Journal saleJournal = new Journal("Baumarkt");
        DefaultInvoiceFactory headereFactory = new DefaultInvoiceFactory();

        InvoiceBuilder builderOne = new InvoiceBuilder();
        builderOne.addLineItem(new LineItem(hammer,5));
        builderOne.addLineItem(new LineItem(nails,7));
        builderOne.addTaxCalculator(new BasicSalesTaxCalculator(0.19));
        builderOne.addInvoiceHeader(headereFactory.createHeader(new Receiver("Marcus Danzer","Tommentalstr. 53")));
        Invoice one = builderOne.create();

        InvoiceBuilder builderTwo = new InvoiceBuilder();
        builderTwo.addLineItem(new LineItem(wood,1));
        builderTwo.addLineItem(new LineItem(nails,400));
        builderTwo.addTaxCalculator(new BasicSalesTaxCalculator(0.19));
        builderTwo.addInvoiceHeader(headereFactory.createHeader(new Receiver("Andrea Danzer","Schneidergasse 16")));
        Invoice two = builderTwo.create();

        saleJournal.addInvoice(one);
        saleJournal.addInvoice(two);
        double journalSum =saleJournal.getSum().asDouble();

        saleJournal.accecpt(new PrintJournalVisitor());

        Assert.assertEquals(saleJournal.getSum().asDouble(),1684.91,0.00000001);
    }

}