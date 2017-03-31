package Aufgaben.Builder;

import Aufgaben.Immutability.Money;

/**
 * Created by Marcus on 31.03.2017.
 */
public class LineItem {
    public final String description;
    public final int quantity;
    public final Money price;


    public LineItem(String description, int quantity, Money price) {
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public Money getSum(){
        return new Money(price.getCents()*quantity);
    }

    public int getQuantity() {
        return quantity;
    }

    public Money getPrice() {
        return price;
    }
}
