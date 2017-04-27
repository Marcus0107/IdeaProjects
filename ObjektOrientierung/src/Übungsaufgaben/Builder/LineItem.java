package Übungsaufgaben.Builder;

import Übungsaufgaben.Composite.Article;
import Übungsaufgaben.Composite.Composite;
import Übungsaufgaben.Money;
import Übungsaufgaben.Visitor.CompositeVisitor;

/**
 * Created by Marcus on 12.04.2017.
 */
public class LineItem implements Composite
{

    private final Article article;
    private final int quantity;

    public LineItem(Article article, int quantity)
    {
        this.article = article;
        this.quantity = quantity;
    }

    public Article getArticle()
    {
        return article;
    }

    public int getQuantity()
    {
        return quantity;
    }


    @Override
    public Money getSum()
    {
        return article.getSum().multiply(quantity);
    }

    @Override
    public String toString()
    {
        return quantity + " " + article.toString();
    }

    @Override
    public void accecpt(CompositeVisitor visitor)
    {
        visitor.visitLineItem(this);
    }
}
