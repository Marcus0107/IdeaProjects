package Musterlösung.AbstractFactory;

/**
 * Created by Marcus on 07.04.2017.
 */public interface InvoiceHeaderFactory {
    InvoiceHeader createHeader( Receiver receiver );
}
