package Übungsaufgaben.AbstractFactory;

/**
 * Created by Marcus on 17.04.2017.
 */
public class DefaultInvoiceFactory implements InvoiceHeaderFactory {
    private int id = 10000;
    @Override
    public InvoiceHeader createHeader(Receiver receiver) {
        return new InvoiceHeader(System.currentTimeMillis(),id++,receiver);
    }
}
