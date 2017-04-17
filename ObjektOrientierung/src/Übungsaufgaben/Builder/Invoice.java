package Übungsaufgaben.Builder;

import Übungsaufgaben.AbstractFactory.InvoiceHeader;
import Übungsaufgaben.Money;

import javax.sound.sampled.Line;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Marcus on 12.04.2017.
 */
public class Invoice {
    private final LinkedList<LineItem> lineItemList;
    private final InvoiceHeader header;

    public Invoice(InvoiceHeader header, LinkedList<LineItem> lineItemList) {
        this.header = header;
        this.lineItemList = lineItemList;
    }

    public Money invoiceSum() {
        long sum = 0;

        for (LineItem item : lineItemList) {
            sum += item.itemSum().getCents();
        }
        return new Money(sum);
    }

    public String lineItemListAsString() {
        String listAsString = "";
        for (LineItem item : lineItemList) {
            listAsString += "\n" + item.toString();

        }
        return listAsString;
    }

    public void print() {
        System.out.println(header.toString() + lineItemListAsString());
    }
}
