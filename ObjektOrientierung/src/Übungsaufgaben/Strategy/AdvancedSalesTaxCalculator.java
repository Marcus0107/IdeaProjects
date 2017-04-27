package Übungsaufgaben.Strategy;

import Übungsaufgaben.Builder.Invoice;
import Übungsaufgaben.Builder.LineItem;
import Übungsaufgaben.Money;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by Marcus on 24.04.2017.
 */
public class AdvancedSalesTaxCalculator implements TaxCalculator
{
    double salesTaxNormal;
    double salesTaxReduced;
    String signalWord;

    public AdvancedSalesTaxCalculator(double salesTaxNormal, double salesTaxReduced, String signalWord)
    {
        this.salesTaxNormal = salesTaxNormal;
        this.salesTaxReduced = salesTaxReduced;
        this.signalWord = signalWord;
    }


    @Override
    public Money calculate(Invoice invoice)
    {
        Money netSum = new Money(0);

        LinkedList<String> descriptionWords;
        String[] descriptionSplitted;
        for (LineItem lineItem : invoice.getLineItems())
        {
            descriptionSplitted = lineItem.getArticle().getDescription().split(" ");
            descriptionWords = new LinkedList<>(Arrays.asList(descriptionSplitted));

            if (descriptionWords.contains(signalWord))
            {
                netSum = netSum.add(lineItem.getSum().multiply(salesTaxReduced));
            }
            else
            {
                netSum = netSum.add(lineItem.getSum().multiply(salesTaxNormal));
            }
        }
        return netSum;
    }
}
