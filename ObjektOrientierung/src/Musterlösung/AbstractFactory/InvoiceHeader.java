package Musterlösung.AbstractFactory;

/**
 * Created by Marcus on 07.04.2017.
 */
public class InvoiceHeader {
    private final long date;
    private final int invoiceId;
    private final Receiver receiver;

    public InvoiceHeader( long date, int invoiceId, Receiver receiver ) {
        this.date = date;
        this.invoiceId = invoiceId;
        this.receiver = receiver;
    }

    public long getDate() {
        return date;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public Receiver getReceiver() {
        return receiver;
    }
}
