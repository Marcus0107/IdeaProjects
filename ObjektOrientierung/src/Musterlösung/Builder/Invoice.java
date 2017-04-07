package Musterlösung.Builder;

import Musterlösung.AbstractFactory.InvoiceHeader;
import Musterlösung.Immutability.Money;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Marcus on 31.03.2017.
 */
public class Invoice {
    private final List<LineItem> lineItems;

    private final InvoiceHeader header;

    public Invoice( InvoiceHeader header, List<LineItem> lineItems ) {
        this.header = header;
        this.lineItems = new ArrayList<LineItem>(lineItems);
    }

    public InvoiceHeader getHeader() {
        return header;
    }

    public List<LineItem> getLineItems() {
        return Collections.unmodifiableList( lineItems );
    }

    public Money getSum() {
        Money sum = new Money( 0 );

        for ( LineItem lineItem : lineItems ) {
            sum = sum.add( lineItem.getSum() );
        }
        return sum;
    }
}
