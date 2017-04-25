package Übungsaufgaben.Strategy;

import Übungsaufgaben.Builder.Invoice;
import Übungsaufgaben.Money;

/**
 * Created by Marcus on 24.04.2017.
 */
public class BasicSalesTaxCalculator implements TaxCalculator
{

    private double basicSalesTax;

    public BasicSalesTaxCalculator(double salesTax)
    {
        basicSalesTax = salesTax;
    }


    @Override
    public Money calculate(Invoice invoice)
    {
        Money invoiceSum = invoice.invoiceSum();

        return invoiceSum.multiply(basicSalesTax);
    }
}
