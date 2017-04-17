package Übungsaufgaben.AbstractFactory;

/**
 * Created by Marcus on 17.04.2017.
 */
public class BackdateInvoiceFactory implements InvoiceHeaderFactory {
    private int id = 50000;

    @Override
    public InvoiceHeader createHeader(Receiver receiver) {
        long unixTime = System.currentTimeMillis() -(60*60*24*10*1000);
        return new InvoiceHeader(unixTime,id++,receiver);
    }
}
