package Übungsaufgaben.Visitor;

import Übungsaufgaben.Builder.Invoice;
import Übungsaufgaben.Builder.LineItem;
import Übungsaufgaben.Composite.Article;
import Übungsaufgaben.Composite.Journal;

/**
 * Created by Marcus on 27.04.2017.
 */
public interface CompositeVisitor
{
    void visitInvoice(Invoice invoice);
    void visitJournal(Journal journal);
    void visitLineItem(LineItem lineItem);
}
