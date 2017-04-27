package Übungsaufgaben.Composite;

import Übungsaufgaben.Money;
import Übungsaufgaben.Visitor.CompositeVisitor;

/**
 * Created by Marcus on 27.04.2017.
 */
public interface Composite
{
    Money getSum();
    void accecpt(CompositeVisitor visitor);

}
