package Übungsaufgaben.AbstractFactory;

import java.util.Date;

/**
 * Created by Marcus on 12.04.2017.
 */
public class InvoiceHeader
{
    final long unixTime;
    final long invoiceId;
    final Receiver receiver;

    public InvoiceHeader(long unixTime, long invoiceId, Receiver receiver){
        this.unixTime = unixTime;
        this.invoiceId = invoiceId;
        this.receiver = receiver;
    }


}
