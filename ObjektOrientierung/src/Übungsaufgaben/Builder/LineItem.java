package Übungsaufgaben.Builder;

import Übungsaufgaben.Money;

/**
 * Created by Marcus on 12.04.2017.
 */
public class LineItem
{


    private final String description;
    private final int quantity;
    private final Money price;

    public LineItem(String description, int quantity, Money price)
    {
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public String getDescription()
    {
        return description;
    }

    public Money getItemSum()
    {
        return this.price.multiply(quantity);
    }


    @Override
    public String toString()
    {
        return "LineItem{" +
                "description = " + description +
                ", quantity = " + quantity +
                ", price = " + price +
                '}';
    }
}
