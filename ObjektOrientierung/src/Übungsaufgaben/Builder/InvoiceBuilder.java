package Übungsaufgaben.Builder;


import Übungsaufgaben.AbstractFactory.InvoiceHeader;

import java.util.LinkedList;

/**
 * Created by Marcus on 12.04.2017.
 */
public class InvoiceBuilder {
    private LinkedList<LineItem> lineItemList;
    private InvoiceHeader invoiceHeader;

    public InvoiceBuilder() {
        lineItemList = new LinkedList<>();
    }

    public void addLineItem(LineItem item) {
        lineItemList.add(item);
    }

    public void addInvoiceHeader(InvoiceHeader header) {
        this.invoiceHeader = header;
    }

    public void removeLineItem(LineItem item) {
        lineItemList.remove(item);
    }

    public Invoice create() {
        return new Invoice(invoiceHeader, lineItemList);
    }
}
