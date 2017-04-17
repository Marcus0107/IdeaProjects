package Übungsaufgaben.AbstractFactory;

/**
 * Created by Marcus on 17.04.2017.
 */
public interface InvoiceHeaderFactory {
    InvoiceHeader createHeader(Receiver receiver);
}
