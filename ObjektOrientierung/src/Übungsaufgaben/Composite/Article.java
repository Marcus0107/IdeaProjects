package Übungsaufgaben.Composite;

import Übungsaufgaben.Money;
import Übungsaufgaben.Visitor.CompositeVisitor;

/**
 * Created by Marcus on 25.04.2017.
 */
public class Article implements Composite
{
    private final String description;
    private final Money price;

    public Article(String description, Money price)
    {
        this.description = description;
        this.price = price;
    }

    public String getDescription()
    {
        return description;
    }

    public Money getPrice()
    {
        return price;
    }

    @Override
    public Money getSum()
    {
        return price;
    }

    @Override
    public void accecpt(CompositeVisitor visitor)
    {

    }

    @Override
    public String toString()
    {
        return description + " â " + price;
    }


}
