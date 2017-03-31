package Aufgaben.Builder;

import Aufgaben.Immutability.Money;

import java.util.ArrayList;

/**
 * Created by Marcus on 31.03.2017.
 */
public class Invoice {
    public final ArrayList<LineItem> lineItemList;

    public Invoice(ArrayList<LineItem> lineItemList) {
        this.lineItemList = lineItemList;
    }

    public Money getInvoiceSum() throws Exception {

        long newCents = 0;
        for (LineItem lineItem : lineItemList) {
            newCents+= lineItem.getSum().getCents();
        }
        return new Money(newCents);
    }

    public void print(){
        for (LineItem li:lineItemList
             ) {
            System.out.println("Description: " +li.description + " Quantity: " + li.quantity + " Price: " + li.price.asDouble());
        }
    }

}
